
public class Homework_0724_01 {
	
	public static void main(String[] args) {
		int[] num = {23, 34, 54, 67, 55, 30, 9, 11, 87, 98};
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int guess;
				
		while(true) {
			System.out.print("請輸入欲找尋的數字(1~100間的整數)或輸入0結束：");
			guess = scan.nextInt(); 
		
			for(int i = 0 ; i < num.length ; i++) {	
				if(guess != num[i])	
					continue;
				
				if(guess == num[i])  			
					System.out.println("恭喜你猜對了！" + "索引值位置是：" + "[" + i + "]" );
					System.out.println();
					break;
			}			
			if(guess == 0) 
				break;			
		}
	}	
}