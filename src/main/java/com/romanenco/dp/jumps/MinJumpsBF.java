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
 * Bottom-up implementation.
 * See http://www.romanenco.com/jumps-problem/
 *
 * @author Andrew Romanenco
 *
 */
public class MinJumpsBF {

    public int jump(int[] A) {
        if (A.length < 2) {
            return 0;
        }
        final int[] memo = new int[A.length];
        Arrays.fill(memo, Integer.MAX_VALUE - 1);
        memo[memo.length - 1] = 0;
        for (int i = memo.length - 2; i >= 0; i --) {
            int min = Integer.MAX_VALUE;
            for (int k = 1; k <= A[i]; k++) {
                if (i + k >= A.length - 1) {
                    min = 1;
                } else {
                    min = Math.min(min, 1 + A[i + k]);
                }
            }
            memo[i] = min;
        }
        return memo[0];
    }

}