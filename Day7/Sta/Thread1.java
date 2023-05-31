package Sta;

public class Thread1 extends Thread {
    private int num;
    public Thread1(int num) {
        this.num = num;
    }
    public void run() {
        try {
            Thread1.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(num + "번 마린 생성 시작");
    }
}






