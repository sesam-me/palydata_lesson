import Controller.Controller;

import java.lang.module.Configuration;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller(sc);

        controller.selectMode();
        while (true){
            controller.selectMode();
        }
    }
}
