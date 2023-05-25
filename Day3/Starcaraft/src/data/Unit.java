package data;
//여기서 실행을 해도 Main 하나만 실행됨. 예를 들어, 프로젝트에서도 Main하나만 실행되고 다른 클래스들은 실행되는 것은 아님


// (캡슐화) 내부적으로 관리할 수 있게, 다른 코드에 영향을 미치치 않음
abstract public class Unit extends Player { // abstract : 얘 혼자서는 아무것도 못해!!하는 뜻. 다른게 필요해! -> zealout에서 쉴드를 만들어 완성이 됨.
	
	static int count = 0; // 카운트는 한 번만 세면 되기 때문에, static
	private int id;
	private String name; // 거의 모든 필드는 private로 씀.
	private int hp;
	private int attackPoint;
	
// "건물","살았다","죽었다" -> 이것 안에서만 사용할 거면 eunm(열거)를 사용.
	private UStatus status; // import를 하지 않았는데, USstatus클래스가 사용 가능하다 -> 왜? package가 같기 때문에!!!!!!
	public String attack() {
		return name + "가 " + attackPoint + "딜을 줬습니다";
	}
	
	
	// getter, setter : getter는 만들어도 되는데, setter는 웬만해서는 쓰지말자
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttackPoint() {
		return attackPoint;
	}
	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	
	
	public Unit(String name, int hp, int attackPoint) {
		this.name = name;
		this.attackPoint = attackPoint;
		this.hp = hp;
		count++;
		id = count;
	}
	

	
	public String getDamage(Unit unit) {
		hp = hp - unit.getAttackPoint();
		return name + "가 " + unit.getName() + "한테 " + unit.getAttackPoint() + "딜을 받았습니다";
	}
}

