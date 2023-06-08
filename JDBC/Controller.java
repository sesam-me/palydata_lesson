package controller;

import domain.dto.SignupDto;
import service.UserService;

import java.sql.SQLException;
import java.util.Scanner;

public class Controller {
    public static UserService service = UserService.getInstance();
    public void selectMode() throws SQLException {
        System.out.println("1. 로그인 2. 회원가입");
        Scanner sc = new Scanner(System.in);

        while (true){

            String mode = sc.nextLine();
            switch (mode){
                case "1":
                    extracted(sc);
                    break;
                case "2":
                    // TODO: signup
                    signup(sc);
                    break;
            }
        }
    }

    private static void extracted(Scanner sc) throws SQLException {
        System.out.println("insert id : ");
        String id = sc.nextLine();
        System.out.println("insert pw : ");
        String pw = sc.nextLine();
        service.login(id, pw);
    }



    private static void signup(Scanner sc) throws SQLException {
        System.out.println("insert id : ");
        String id = sc.nextLine();
        System.out.println("insert pw : ");
        String pw = sc.nextLine();
        System.out.println("insert name: ");
        String name = sc.nextLine();
        SignupDto dto = new SignupDto(id, pw, name);
        service.signup(dto);

        UserService service = UserService.getInstance();
        service.login(id, pw);
    }
}


