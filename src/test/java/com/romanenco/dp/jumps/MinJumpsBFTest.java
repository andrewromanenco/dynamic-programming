/*
 * Copyright 2014 Andrew Romanenco
 * www.romanenco.com
 * andrew@romanenco.com
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

package com.romanenco.dp.jumps;

import org.junit.Assert;
import org.junit.Test;

public class MinJumpsBFTest {

    @Test
    public void test() {
        final MinJumpsBF solution = new MinJumpsBF();
        final int result = solution.jump(new int[]{3,5,1,1,1,1});
        Assert.assertEquals(2, result);
    }

    @Test
    public void testSlow() {
        final MinJumpsBF solution = new MinJumpsBF();
        final int result = solution.jump(new int[]{5,6,4,4,6,9,4,4,7,4,4,8,2,6,
                8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4});
        Assert.assertEquals(5, result);
    }

}
