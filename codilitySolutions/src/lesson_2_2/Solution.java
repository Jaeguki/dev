/**
 * 이 클래스는
 * codility lesson2_2 문제
 * 해결을 위한 Solution 클래스
 *
 * @version     1.00 02/14/19
 * @author      유재국
 * @since       JDK1.8
 */

package lesson_2_2;

public class Solution {
    public int[] solution(int[] A, int K) {
    	int [] temp = new int[A.length];
    	for(int i = 0; i < A.length; i++) {
    		try {
    			temp[i+K%A.length] = A[i];
    		}catch(ArrayIndexOutOfBoundsException e) {
    			temp[i+K%A.length-A.length] = A[i];
    		}
    	}
    	return temp;
    }
}
