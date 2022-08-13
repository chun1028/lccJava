/**
 * 已經有一個武士及舞者
	請建立一個Game 的主程式
	請讓這二個角色互打。
	互打的部份請使用 random 的方式來互打
	也可以使用必殺技，
	互打時， hp 會降低。直到某一個角色的hp為0 時。
	此程式結束。並顯示那一位角色勝利。
 * 
 */

// 老師解答如下:

public class Homework_0731 {
	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.print("請輸入武士的姓名：");
		String man = scan.next();
		System.out.print("請輸入舞者的姓名：");
		String man2 = scan.next();
		
		
		Warrior wa = new Warrior(man, 100, 500);
		Dance da = new Dance(man2, 100, 650);
		
		int die;
		
while(wa.getHp() > 0 && da.getHp() > 0) {
			
			//決定每一次回合怎麼打
			int number = (int)(Math.random() * 100 + 1);
			
			if (number % 2 == 0) {  // 武士
				die = (int)(Math.random() * 20 + 1);
				if (die == 5 || die == 15) { //使用必殺技
					
					System.out.printf("%s 正使出：", man);
					wa.deathblow();
					
					da.changeHp((int)(Math.random() * 15 + 10 )); // 10~24
					System.out.printf("%s血量：%d\t%s血量：%d\n", man,wa.getHp(),man2,da.getHp());
					
					
				}else {
					//一般攻擊
					System.out.printf("%s 正使出：", man);
					wa.fight();
					
					da.changeHp((int)(Math.random() * 15 )); // 0~14
					System.out.printf("%s血量：%d\t%s血量：%d\n", man,wa.getHp(),man2,da.getHp());
					
					
				}
				
			}else {  //  舞者
				die = (int)(Math.random() * 20 + 1);
				if (die == 4 || die == 16) { //使用必殺技
					
					//一般攻擊
					System.out.printf("%s 正使出：", man2);
					da.deathblow();
					
					wa.changeHp((int)(Math.random() * 10 + 10 )); // 10~19
					System.out.printf("%s血量：%d\t%s血量：%d\n", man2,da.getHp(),man,wa.getHp());
					
					
				}else {
					//一般攻擊
					System.out.printf("%s 正使出：", man2);
					da.fight();
					
					wa.changeHp((int)(Math.random() * 10 )); // 0~9
					System.out.printf("%s血量：%d\t%s血量：%d\n", man2,da.getHp(),man,wa.getHp());
					
					
				}
				
			}
			System.out.println();
			
			
		}
		System.out.println();
		System.out.println();
		if (wa.getHp() > 0) {
			System.out.println(wa.getName() + "勝利了！");
		}else {
			System.out.println(da.getName() + "勝利了！");
		}
		
		
		
		
	}

}
