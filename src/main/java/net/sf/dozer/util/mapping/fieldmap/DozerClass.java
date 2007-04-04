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
public class DozerClass implements Cloneable {
  private String name;
  private Class classToMap;
  private String beanFactory;
  private String factoryBeanId;
  private String mapGetMethod;
  private String mapSetMethod;
  private boolean isCustomMap;
  private String createMethod;
  private Boolean mapNull;
  private Boolean mapEmptyString;

  public DozerClass() {
  }

  public DozerClass(String name, Class classToMap, String beanFactory, String factoryBeanId,
                    String mapGetMethod, String mapSetMethod, Boolean mapNull, Boolean mapEmptyString) {
    this.name = name;
    this.classToMap = classToMap;
    this.beanFactory = beanFactory;
    this.factoryBeanId = factoryBeanId;
    this.mapGetMethod = mapGetMethod;
    this.mapSetMethod = mapSetMethod;
    this.mapNull = mapNull;
    this.mapEmptyString = mapEmptyString;
  }

  public String getBeanFactory() {
    return beanFactory;
  }

  public void setBeanFactory(String beanFactory) {
    this.beanFactory = beanFactory;
  }

  public Class getClassToMap() {
    return classToMap;
  }

  public void setClassToMap(Class classToMap) {
    this.classToMap = classToMap;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) throws ClassNotFoundException {
    this.name = name;
    classToMap = Thread.currentThread().getContextClassLoader().loadClass(name);
  }

  public String getFactoryBeanId() {
    return factoryBeanId;
  }

  public void setFactoryBeanId(String factoryBeanId) {
    this.factoryBeanId = factoryBeanId;
  }

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public String getMapGetMethod() {
    return mapGetMethod;
  }

  public void setMapGetMethod(String mapGetMethod) {
    this.mapGetMethod = mapGetMethod;
  }

  public String getMapSetMethod() {
    return mapSetMethod;
  }

  public void setMapSetMethod(String mapSetMethod) {
    this.mapSetMethod = mapSetMethod;
  }

  public boolean isCustomMap() {
    return isCustomMap;
  }

  public void setCustomMap(boolean isCustomMap) {
    this.isCustomMap = isCustomMap;
  }

  public String getCreateMethod() {
    return createMethod;
  }

  public void setCreateMethod(String createMethod) {
    this.createMethod = createMethod;
  }

  public Boolean getMapNull() {
    return mapNull;
  }

  public void setMapNull(Boolean mapNull) {
    this.mapNull = mapNull;
  }

  public Boolean getMapEmptyString() {
    return mapEmptyString;
  }

  public void setMapEmptyString(Boolean mapEmptyString) {
    this.mapEmptyString = mapEmptyString;
  }

}