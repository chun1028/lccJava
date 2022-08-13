

public class Dance extends Role{

	public Dance(String name, int hp, int mp) {
		super(name, hp, mp);			
	}
	public void fight() {
		System.out.println("迴旋踢攻擊");
	}
	public void cure() {
		System.out.println("補血功能！！！");
	}
	public void encourage() {
		System.out.println("鼓舞軍心！！！");
	}
	public void deathblow() {
		System.out.println("我是胖虎，我要唱歌！！！");
	}

}
