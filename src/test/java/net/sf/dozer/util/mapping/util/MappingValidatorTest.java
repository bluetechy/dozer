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
package net.sf.dozer.util.mapping.util;

import net.sf.dozer.util.mapping.DozerTestBase;
import net.sf.dozer.util.mapping.MappingException;
import net.sf.dozer.util.mapping.vo.SimpleObj;

/**
 * @author tierney.matt
 */
public class MappingValidatorTest extends DozerTestBase {
  private MappingValidator validator = new MappingValidator();

  public void testValidateMappingRequest_NullSrcObj() throws Exception {
    try {
      validator.validateMappingRequest(null);
      fail("Should have thrown exception");
    } catch (MappingException e) {
    }
  }
}