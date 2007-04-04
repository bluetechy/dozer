/*
 * Copyright 2005-2007 the original author or authors.
 *
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
package net.sf.dozer.util.mapping.fieldmap;

/**
 * @author garsombke.franz
 * @author sullins.ben
 * @author tierney.matt
 * 
 */
public class GenericFieldMap extends FieldMap {
  protected boolean isMethodMap = false;
  protected boolean isCustomMap = false;
  private String relationshipType;
  
  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public boolean isMethodMap() {
    return isMethodMap;
  }

  public void setMethodMap(boolean isMethodMap) {
    this.isMethodMap = isMethodMap;
  }

  public boolean isCustomMap() {
    return isCustomMap;
  }

  public void setCustomMap(boolean isCustomMap) {
    this.isCustomMap = isCustomMap;
  }

}