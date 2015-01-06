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

package com.romanenco.dp.coinchange;

import org.junit.Assert;
import org.junit.Test;

public class CoinChangeTDTest {

    @Test
    public void test1() {
        final int[] coins = new int[]{1, 5, 10, 25};
        final int target = 46;
        final CoinChangeTD solution = new CoinChangeTD(coins, target);
        final int result = solution.getMinNumberOfCoins();
        Assert.assertEquals(4, result);
    }

    @Test
    public void test2() {
        final int[] coins = new int[]{1, 3, 4};
        final int target = 6;
        final CoinChangeTD solution = new CoinChangeTD(coins, target);
        final int result = solution.getMinNumberOfCoins();
        Assert.assertEquals(2, result);
    }

    @Test
    public void testSlow() {
        final int[] coins = new int[]{1, 3, 4};
        final int target = 40;
        final CoinChangeTD solution = new CoinChangeTD(coins, target);
        final int result = solution.getMinNumberOfCoins();
        Assert.assertEquals(10, result);
    }

    @Test
    public void testSlower() {
        final int[] coins = new int[]{1, 3, 4};
        final int target = 41;
        final CoinChangeTD solution = new CoinChangeTD(coins, target);
        final int result = solution.getMinNumberOfCoins();
        Assert.assertEquals(11, result);
    }

}
