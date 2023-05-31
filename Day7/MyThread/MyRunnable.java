package MyThread;

public class MyRunnable implements Runnable{ //Runnable:내부에 뭐가있나봄
    private int param;
    public MyRunnable(int param) {
        this.param = param;
    }

    @Override
    public void run() { // Override Method 클릭
        for (int i = 0; i < 10; i++) {
            System.out.println(param);
            try { // 시도했을 때
                Thread.sleep(1000); // sleepl:한번 돌아갈 때마다 1초 로딩
            } catch (InterruptedException e) { // 이 에러가 발생하면
                throw new RuntimeException("에러발생"); // 이렇게 실행해달라
            }
        }
    }
}
