package MyThread;

import dto.Person;

public class MyThread extends Thread{ //extends Thead: 자체로 Thread만듦,,Thread(구연체) 이렇게 하는게 아니라
    private int time;
    private int id;
    private Person person;
    public static int count;

    public MyThread(int time, int id, Person person) {
        this.time = time;
        this.id = id;
        this.person = person;
        count++;
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            person.setName("name" + id);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(id);
            System.out.println(person.getName());
        }
        count--;
        System.out.println("대기순번 : " + count); // 숫자 멋대로임! 누가먼저 끝났는지 알 수 없음
    }
}
