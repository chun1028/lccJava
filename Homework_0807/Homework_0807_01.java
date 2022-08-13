/**
 * 費氏數列
	特點：前二項數字相加之和 會等於 第三項
	1、1、2、3、5、8、13、21、34、55
	古典問題：有一對兔子(公母)，從出生後第3個月起每個月都
	生一對兔子，小兔子長到第三個月後每個月又生一對兔子
	，假如兔子都不死，問每個月的兔子總數為多少？
	提示：兔子的規律為數列 1,1,2,3,5,8,13,21....  
	請輸入第幾個月，來顯示目前兔子總數：
 * 
 */

import java.util.Scanner;
public class Homework_0807_01 {
	public static int rabbit(int month) {
		if(month == 1 || month == 2)
			return 1;
		else
			return (rabbit(month-1) + rabbit(month-2)); // 對
	}
	
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.print("請輸入第幾個月：");
		int month = Scan.nextInt();
		System.out.printf("第%d個月後，兔子總數為%d隻\n", month, (rabbit(month))*2);
				
	}
}
