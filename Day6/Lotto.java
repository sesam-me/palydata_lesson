import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.XMLFormatter;

public class Lotto {
    public static void main(String[] args) {
//        0<=Math.random()<1
//        1<=number<=46
//        0*45 +1 < number < 1*45 +1

//        6개 중복 X
//        0. set 정의
//        1. set의 사이즈가 6이 될 때까지
//        2. number를 만들기
//        2-1. Math.random() *45 +1 double -> int
//        3. 출력
//        4. 5개 출력


        Set<Integer> set = new HashSet<>();
        while (set.size() != 6) { //set.size() = set.length()라고 생각해. 길이!!!
            set.add((int) (Math.random() * 45) + 1);
//            System.out.println(i); // 여기에 i를 넣으면 안되나?
        }

        for (int i : set) {
            System.out.println(i);
        }
    }
}
