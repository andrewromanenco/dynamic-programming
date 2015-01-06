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
 * Top-down with memoization.
 * See http://www.romanenco.com/coin-change-problem/
 *
 * @author Andrew Romanenco
 *
 */
public class CoinChangeTD {

    private final int[] coins;
    private final int sum;
    private final int[] memo;

    public CoinChangeTD(int[] coins, int sum) {
        this.coins = coins;
        this.sum = sum;
        memo = new int[sum + 1];
        for (int i = 0; i < sum + 1; i++) {
            memo[i] = -1;
        }
        memo[0] = 0;
    }

    public int getMinNumberOfCoins() {
        return getMinNumberOfCoins(sum);
    }

    private int getMinNumberOfCoins(int sum) {
        if (memo[sum] != -1) {  // eliminate duplicated calculations
            return memo[sum];
        }
        if (sum == 0) {
            return 0;  // base case
        }
        int result = Integer.MAX_VALUE;
        for (int coin: coins) {
            if (coin <= sum) {
                result = Math.min(
                        result,
                        getMinNumberOfCoins(sum - coin) + 1
                        );
            }
        }
        memo[sum] = result;  // save for reuse
        return result;
    }

}
