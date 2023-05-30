import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) { //psvm
//        int t = 0; // reformate : 저장하면 알아서 들여쓰기. shift+tap : 앞으로 나옴..
//        System.out.println();//sout
////        Set Queue Stack
//        String str = ""; // ctrl누르고 클릭! 설명나옴
//
////      # final :
//        final float pie = 3.14f;
//        final Integer i = 0; // 한번 만들면 끝!
//        # List
//        List<Integer> List = new ArrayList<>();

        Set<Integer> set = new HashSet<>(); // ctrl + space : import
//        순서X, 중복X
//        에러 종류 : 1. error : 못돌림, 빨간색 표시 2. warning : 경고, 돌릴 수는 있음,노란색 표시
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set.size());
        for (Integer i : set) {
            System.out.printf("i%d 입니다.%d %s\n", (float) i, i, "ddd");
        }
    }
}

//final class Person { // class 앞의 final은 class 안에 내용이 변함이 없다.
//    // final은 상속하는 것도 불가능(extends)
//    private final Integer num; // final : getter가능, setter불가능 -> 한번 설정하면 끝
//    private final String name;
//
//    public Person(Integer num, String name) { // Alt + insert
//        this.num = num;
//        this.name = name;
//    }
//}