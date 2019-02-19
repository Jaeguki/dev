/**
 * 이 클래스는
 * codility lesson4_3 문제
 * 해결을 위한 Solution 클래스
 *
 * @version     1.00 02/19/19
 * @author      유재국
 * @since       JDK1.8
 */

package lesson_4_3;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
	public int solution(int[] A) {
		Arrays.sort(A);
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < A.length; i++) {
			if(A[i]<0) {
				continue;
			}else {
				hm.put(A[i], i);
			}
		}
		
		if(hm.size()==0)
			return 1;
		int cnt = 1;
		for(int i = 1; i < hm.size()+1; i++) {
			cnt++;
			if(hm.get(i) == null)
				return i;
		}
		
		return cnt;
	}
}
