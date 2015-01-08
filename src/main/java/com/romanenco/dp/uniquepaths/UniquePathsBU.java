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

package com.romanenco.dp.uniquepaths;

/**
 * Unique paths problem.
 * https://oj.leetcode.com/problems/unique-paths/
 *
 * Bottom-up solution.
 *
 * See http://www.romanenco.com/unique-paths-problem/
 *
 * @author Andrew Romanenco
 *
 */
public class UniquePathsBU {

    public long uniquePathsTD(int m, int n) {
        final long[][] paths = new long[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            paths[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            paths[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
            }
        }
        return paths[m - 1][n - 1];
    }

}
