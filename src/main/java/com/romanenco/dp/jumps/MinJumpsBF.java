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

/**
 * Min jumps problem.
 * Brute force solution.
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
        return jump(A, 0);
    }

    private int jump(int[] A, int index) {
        if (index >= A.length - 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= A[index]; i++) {
            min = Math.min(min, 1 + jump(A, index + i));
        }
        return min;
    }

}
