package com.inmobi.databus;
/*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
public class DestinationStream {
  private final int retentionInDays;
  private final String name;
  private final Boolean isPrimary;

  public DestinationStream(String name, int retentionInDays, Boolean isPrimary) {
    this.name = name;
    this.retentionInDays = retentionInDays;
    this.isPrimary = isPrimary;
  }

  public boolean isPrimary() {
    return isPrimary;
  }

  public String getName() {
    return name;
  }

  public int getRetentionInDays() {
    return retentionInDays;
  }
}