

public class Role {
	private String name;
	private int hp, level, mp;
	
	public Role(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.level = 1;
		this.mp = mp;
	}
	public void fight() {
		System.out.println("角色攻擊");
	}
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int level() {
		return this.level;
	}
	public int getMp() {
		return this.mp;
	}
	public void setName(String name) {
		this.name =  name;
	}
	public void setHP(int hp) {
		this.hp = hp;
	}
	public void setLevel(int leval) {
		this.level = level;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public void changeHp(int hp) {
		this.hp -= hp;
	}

}
