import java.util.Stack;

public class Test1 {
    //  stack
//  후입선출 LIFO
    public static void main(String[] args) {
        stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        for (int i = 0; i < 3; i++) {
            System.out.println(stack.pop());
            System.out.println(stack.peek());
//            pop : 제거 하나 꺼냄
//            peak : 하나 꺼내서 보기만
        }
        print(0);
    }

    //재귀함수 : 자기자신을 부르는 것.
    static void print(int i) {
        if (i > 10) return;
        print(i + i);
        System.out.println(i);
        print(i + 1);
    }
}
