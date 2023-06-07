package Service;


// Service : 내가 보는 곳

// # singleton
// 혼자 돌아갈 수 있게 하는 것



import java.util.ArrayList;
import java.util.List;

public class Service {
    private final List<Integer> list = new ArrayList<>();

    public void insert(int number){
        list.add(number);
    }


    public static Service instance; // static : 하나만 존재한다
    public static Service getInstance(){
        if(instance == null) instance = new Service();
    }

}
