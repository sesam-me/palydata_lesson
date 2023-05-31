package Sta;

public class Thread3 extends Thread{
    Marine marine;

    public Thread3(Marine marine) {
        this.marine = marine;
    }

    public void run(){
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        marine.setStatus("완료됨");
    }
}
