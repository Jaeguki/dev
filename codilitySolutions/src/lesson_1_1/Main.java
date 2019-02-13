/**
 * 이 클래스는
 * codility lesson1_1 문제
 * 해결을 위한 Main 클래스
 *
 * @version     1.00 02/14/19
 * @author      유재국
 * @since       JDK1.8
 */

package lesson_1_1;

public class Main {
    public static void main(String args[]) {
        Solution s = new Solution();
        
        if(s.solution(16) == 0)
        	System.out.println("correct");
        else
        	System.out.println("wrong");
        
        if(s.solution(9) == 2)
        	System.out.println("correct");
        else
        	System.out.println("wrong");

        if(s.solution(529) == 4)
        	System.out.println("correct");
        else
        	System.out.println("wrong");

        if(s.solution(20) == 1)
        	System.out.println("correct");
        else
        	System.out.println("wrong");

        if(s.solution(15) == 0)
        	System.out.println("correct");
        else
        	System.out.println("wrong");

        if(s.solution(32) == 0)
        	System.out.println("correct");
        else
        	System.out.println("wrong");
        
    }
}