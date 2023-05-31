package Sta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Marine> list = new ArrayList<>();


    public static void main(String[] args) {

        while (true) {
            System.out.println("1.유닛 생성 2.팩토리 확인");
            Scanner sc = new Scanner(System.in);

            int num = Integer.parseInt(sc.nextLine());

            switch (num) {
                case 1:
//                    Thread1 thread1 = new Thread1(num);
//                    thread1.start();
                    Marine marine = new Marine(1);
                    list.add(marine);
                    Thread3 thread3 = new Thread3(marine);
                    thread3.start();
                    break;

                case 2:
//                    Thread2 thread2 = new Thread2();
//                    thread2.start();
                    System.out.println(list);
                    break;
            }
        }


    }
}

