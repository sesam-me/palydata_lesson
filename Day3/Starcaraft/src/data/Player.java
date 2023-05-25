package data;

// 다중상속을 되지 않음.
// 다중상속을 하고 싶으면 Unit에 extends를 달아서 상속하는 방법이 있으나, 코드가 복잡해지기 때문에 추천하지 않음.
public class Player { // Player가 가지는 persons인구수
	private int persons = 0; // 초기 인구수는 0명
	public int getPersons() {
		return persons;
	}
}
