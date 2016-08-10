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
package org.apache.apex.malhar.stream.sample.complete;

import org.junit.Test;
import org.apache.hadoop.conf.Configuration;
import com.datatorrent.api.LocalMode;

/**
 * Test for {@link TrafficRoutes}.
 */
public class TrafficRoutesTest
{
  @Test
  public void TrafficRoutesTest()
  {
    LocalMode lma = LocalMode.newInstance();
    Configuration conf = new Configuration(false);
  
    TrafficRoutes app = new TrafficRoutes();
    try {
      lma.prepareDAG(app, conf);
    } catch (Exception e) {
      e.printStackTrace();
    }
    LocalMode.Controller lc = lma.getController();
    
    lc.run(20000);
  }
}
