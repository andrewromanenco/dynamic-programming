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

import java.util.Arrays;

/**
 * Min jumps problem.
 * Top-down with memoization.
 * See http://www.romanenco.com/jumps-problem/
 *
 * @author Andrew Romanenco
 *
 */
public class MinJumpsBU {

    public int jump(int[] A) {
        if (A.length < 2) {
            return 0;
        }
        final int[] memo = new int[A.length];
        Arrays.fill(memo, -1);
        return jump(A, 0, memo);
    }

    private int jump(int[] A, int index, int[] memo) {
        if (index >= A.length - 1) {
            return 0;
        }
        if (memo[index] != -1) {
            return memo[index];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= A[index]; i++) {
            min = Math.min(min, 1 + jump(A, index + i, memo));
        }
        memo[index] = min;
        return min;
    }

}
