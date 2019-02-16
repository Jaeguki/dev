/**
 * 이 클래스는
 * codility lesson3_1 문제
 * 해결을 위한 Main 클래스
 *
 * @version     1.00 02/16/19
 * @author      유재국
 * @since       JDK1.8
 */
package lesson_3_1;

public class Main {
	public static void main(String args[]) {
		Solution s = new Solution();
		int X = 1, Y = 5, D = 2;
		if (s.solution(X, Y, D) == 2)
			System.out.println("correct");
		else
			System.out.println("wrong");
	}
}
