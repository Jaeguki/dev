/**
 * 이 클래스는
 * codility lesson3_2 문제
 * 해결을 위한 Solution 클래스
 *
 * @version     1.01 02/16/19
 * @author      유재국
 * @since       JDK1.8
 */
package lesson_3_2;

import java.util.Arrays;

public class Solution {
	public int solution(int[] A) {
        Arrays.sort(A);
		for(int i =0; i < A.length+1; i++) {
			try {
				if(i+1 != A[i])
					return i+1;
			}catch(Exception e) {
				return i+1;
			}
		}
		return 0;
	}
}
