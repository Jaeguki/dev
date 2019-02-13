/**
 * 이 클래스는
 * codility lesson1_1 문제
 * 해결을 위한 Solution 클래스
 *
 * @version     1.00 02/14/19
 * @author      유재국
 * @since       JDK1.8
 */

package lesson_1_1;

public class Solution {
    public int solution(int N) {
        int cnt = 0;
        int temp = 0;

        String binaryString = Integer.toBinaryString(N);
        for(int i = 0; i < binaryString.length(); i++) {

            if('1' == binaryString.charAt(i)) {
                if ( cnt < temp)
                    cnt = temp;
                temp = 0;
            }

            if('0' == binaryString.charAt(i)) {
                temp++;
            }

        }
        return cnt;
    }
}