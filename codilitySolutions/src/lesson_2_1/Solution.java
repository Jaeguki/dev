/**
 * 이 클래스는
 * codility lesson2_1 문제
 * 해결을 위한 Solution 클래스
 *
 * @version     1.00 02/14/19
 * @author      유재국
 * @since       JDK1.8
 */

package lesson_2_1;

import java.util.HashMap;

public class Solution {
	public int solution(int[] A) {
		int idx = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0; i < A.length; i ++) {
			if(!hm.containsKey(A[i]))
				hm.put(A[i], 1);
			else
				hm.remove(A[i]);
		}
		
		for(int key : hm.keySet()){
            idx = key; 
        }
		return idx;
	}
}
