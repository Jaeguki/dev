/**
 * 이 클래스는
 * codility lesson3_2 문제
 * 해결을 위한 Solution 클래스
 *
 * @version     1.00 02/16/19
 * @author      유재국
 * @since       JDK1.8
 */
package lesson_3_2;

import java.util.HashMap;

public class Solution {
	public int solution(int[] A) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < A.length; i++) {
			hm.put(i, A[i]);
		}

		for(int i = 1; i < A.length+2; i++) {
			if(hm.containsValue(i)) {
				continue;
			}else
				return i;
			
		}
		
		return 0;
	}
}
