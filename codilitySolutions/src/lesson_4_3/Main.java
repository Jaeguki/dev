/**
 * 이 클래스는
 * codility lesson4_3 문제
 * 해결을 위한 Main 클래스
 *
 * @version     1.01 02/19/19
 * @author      유재국
 * @since       JDK1.8
 */

package lesson_4_3;

public class Main {
	public static void main(String args[]) {
		Solution s = new Solution();
		int[] A = {1, 3, 6, 4, 1, 2};
		if(s.solution(A) == 5)
			System.out.println("correct");
		else
			System.out.println("wrong");
	}
}
