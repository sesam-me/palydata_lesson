import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // 불변성 : 데이터 원본유지를 하고 새로운 걸 만들어야함
        list.add(1);
        list.add(2);
        list.add(3);
        // 만약 list*2한 데이터를 요구
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i) *2);
        }
        System.out.println(list); // 원본 list는 유지(불변성)
        System.out.println(list2);

//        # stream : 자바 버전 1.8부터 나왔음
//        익명 함수
//        직접 만들기
//        모두 그래그 -> Refator -> introduce variable
//        # map : 같이가 같은 리스트를 만드는 것
        List<Integer> collect = list
                .stream()
                .map(el -> el * 2) //foreach와 비슷
                .collect(Collectors.toList()); // list로 형변환
        System.out.println(collect);
//        for과 stream은 비슷하지만 for문은 더 빠르다. 하지만 stream을 쓰는 이유는 가독성이 좋기 때문

// ctrl + alt + v: 변수 삽입
//      # filter
        List<Integer> collect1 = list
                .stream()
                .filter(el -> el % 2 == 0) // 짝수가 있으면(true)되면
                .map(el -> el * 2) // 짝수 중에서 2배하기
                .collect(Collectors.toList()); // 형변환해서
        System.out.println(collect1); // 출력해라
    }
}