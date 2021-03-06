/**
 * Copyright (C) 2016-2019 Expedia, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hotels.road.loadingbay;

public enum AgentProperty {
  TRUCK_PARK_STATE("truckParkState"),
  HIVE_SCHEMA_VERSION("hiveSchemaVersion"),
  HIVE_TABLE_CREATED("hiveTableCreated"),
  MESSAGE("message");

  private static final String ROOT_PATH = "/destinations/hive/status/%s";
  private final String propertyName;

  private AgentProperty(String propertyName) {
    this.propertyName = propertyName;
  }

  public String path() {
    return String.format(ROOT_PATH, propertyName);
  }

}
