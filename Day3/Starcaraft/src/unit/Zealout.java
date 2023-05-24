package unit;

import data.Unit;

public class Zealout extends Unit { // Unit은 import해줌
	private int shield = 10; // 생성할 때부터 100으로 생성(디폴트값)
	
	public Zealout() { // super로 위에 생성되었던 생성자를 가져오므로, 여기에 따로 명시해 줄 필요 없다.
		super("Zealout", 100, 12); 	// super : 위에 생성자를  호출한다.
		this.shield = shield;
	}
	
	// 마린을 여기에 만들면 안되나..?

	@Override
	public String getDamage(Unit unit) {
		if(shield<0) {
		return super.getDamage(unit);
//		super.setHp(super.getHp() - unit.getAttackPoint()); // super : extends꺼 가져옴
//		return super.getName() + "가 " + unit.getName() + "한테 " + unit.getAttackPoint() + "딜을 받았습니다";
		} else {
			shield -= unit.getAttackPoint();
			return super.getName() + "가 " + unit.getName() + "한테 " + unit.getAttackPoint() + "딜을 받았습니다";
		}

	}
	
}
