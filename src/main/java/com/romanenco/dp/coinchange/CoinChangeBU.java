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

/**
 * Coin change problem.
 * Bottom-up implementation.
 * See http://www.romanenco.com/coin-change-problem/
 *
 * @author Andrew Romanenco
 *
 */
public class CoinChangeBU {

    public int getMinNumberOfCoins(int[] coins, int sum) {
        int[] solution = new int[sum + 1];
        for (int i = 0; i < solution.length; i++) {
            solution[i] = Integer.MAX_VALUE;
        }
        solution[0] = 0;  // base case
        for (int i = 1; i <=sum; i++) {  // build solution one-by-one
            for (int coin: coins) {
                if (i - coin >= 0) {
                    solution[i] = Math.min(
                            solution[i],
                            solution[i - coin] + 1
                            );
                }
            }
        }
        return solution[sum];
    }

}
