/*
 * Copyright © 2014 Cask Data, Inc.
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

package co.cask.cdap.client.common;

import co.cask.cdap.proto.id.ApplicationId;

/**
 * Thrown when an application is not found.
 */
public class ApplicationNotFoundException extends NotFoundException {

	private static final long serialVersionUID = 4680404082842141029L;
	private final ApplicationId id;

	public ApplicationNotFoundException(ApplicationId id) {
		super(id);
		this.id = id;
	}

	public ApplicationId getId() {
		return id;
	}
}
