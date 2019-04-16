/*
 * Copyright © 2015 Cask Data, Inc.
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
package co.cask.cdap.client.exception;

import co.cask.cdap.client.config.ConnectionConfig;

import javax.annotation.Nullable;

/**
 * Thrown when the client is not connected, but a request was attempted.
 */
public class DisconnectedException extends RuntimeException {

	private static final long serialVersionUID = -5477622708198976979L;

	@Nullable
	private final ConnectionConfig connectionConfig;

	public DisconnectedException(@Nullable ConnectionConfig connectionConfig) {
		this.connectionConfig = connectionConfig;
	}

	public DisconnectedException() {
		this(null);
	}

	@Nullable
	public ConnectionConfig getConnectionConfig() {
		return connectionConfig;
	}
}
