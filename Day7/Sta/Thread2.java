package Sta;

public class Thread2 extends Thread {
    public void run() {

        try {

            for (int i = 0; i < 3; i++) {
                Marine marine= new Marine(i);
                System.out.println(marine);
                Thread1.sleep(2000);
                marine.setStatus("완료됨");
                System.out.println(i+" "+marine);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
