package co.cask.cdap.client.proto;
/*
 * Copyright 2019, Dr. Krusche & Partner PartG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

import java.util.Map;

public class DatasetMeta {

	private DatasetSpecification spec;

	private String hiveTableName;
	private String ownerPrincipal;

	public DatasetMeta(Map<String, Object> metadata) {

		/*
		 * The DatasetTypeMeta 'type' is not used here as it describes internal metadata
		 * about dataset modules
		 */
		@SuppressWarnings("unchecked")
		Map<String, Object> spec = (Map<String, Object>) metadata.get("spec");
		this.spec = new DatasetSpecification(spec);

		this.hiveTableName = null;
		if (metadata.containsKey("hive_table"))
			this.hiveTableName = (String) metadata.get("hive_table");

		this.ownerPrincipal = null;
		if (metadata.containsKey("principal"))
			this.ownerPrincipal = (String) metadata.get("principal");

	}

	public DatasetSpecification getSpec() {
		return spec;
	}

	public String getHiveTableName() {
		return hiveTableName;
	}

	public String getOwnerPrincipal() {
		return ownerPrincipal;
	}

}
