package Controller;

import Service.Service;

import java.util.Scanner;

// 변수명은 소문자, 낙타
// 클래스, 생성자는 대문자
public class Controller {
    private Scanner sc; // 필드

    private final Service service = Service.getInstance(); // new Service가 아니라 getInstance()를 쓰는 이유는 계속해서 new를 만드는게 아니라 결국 하나만 만듦
    public Controller(Scanner sc) { // 생성자
        this.sc = sc;
    }


    /**
     * 기능 : 모드를 찾아 검색한다
     * @param i : None param은 매개변수를 의미
     * @return : None
     */

    // 유저가 보는 곳
    public void selectMode(){ // 메소드
        int mode;
        try {
            mode = Integer.parseInt(sc.nextLine()); // 만약 들어오는게 숫자가 아니라면?
        } catch (Exception e) { // 에러가 나면
            mode = 0; // 0처리
        }

        if (mode == 1){
//            TODO : insert기능 만들기
            service.insert(sc.nextInt());
        } else if(mode == 2){
//            TODO : 전체 찾기 기능 만들기
        } else if(mode == 3){
//            TODO : 인덱스를 입력받아 찾는거 만들기
        } else {
//            TODO : selectMode 다시 실행
        }


    }
}


