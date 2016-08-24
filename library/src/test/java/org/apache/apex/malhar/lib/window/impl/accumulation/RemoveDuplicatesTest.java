/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.apex.malhar.lib.window.impl.accumulation;

import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link RemoveDuplicates}.
 */
public class RemoveDuplicatesTest
{
  @Test
  public void RemoveDuplicatesTest()
  {
    RemoveDuplicates<Integer> rd = new RemoveDuplicates<>();
    
    Set<Integer> accu = rd.defaultAccumulatedValue();
    Assert.assertEquals(0, accu.size());
    Assert.assertEquals(1, rd.accumulate(accu, 10).size());
    Assert.assertEquals(2, rd.accumulate(accu, 11).size());
    Assert.assertEquals(2, rd.accumulate(accu, 11).size());
  }
}
