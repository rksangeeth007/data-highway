/**
 * Copyright (C) 2016-2019 Expedia Inc.
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
package com.hotels.road.trafficcontrol.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.hotels.road.rest.model.RoadType;

import lombok.Value;
import lombok.experimental.Wither;

@Value
public class KafkaRoad {

  String name;
  @Wither
  String topicName;
  RoadType type;
  TrafficControlStatus status;

  @JsonCreator
  public KafkaRoad(
      @JsonProperty("name") String name,
      @JsonProperty("topicName") String topicName,
      @JsonProperty("type") RoadType type,
      @JsonProperty("status") TrafficControlStatus status) {
    this.name = name;
    this.topicName = topicName;
    this.type = type == null ? RoadType.NORMAL : type;
    this.status = status;
  }
}
