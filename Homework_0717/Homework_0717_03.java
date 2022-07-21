
public class Homework_0717_03 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int number;	
		while(true) {
			System.out.print("請輸入一個1~100間的整數：");
			number = scan.nextInt();		
			
			if(number >=1 && number <= 100) {		
				System.out.print(number+"的因數有：");
				for(int i = 1; i <= number; i++ ) {
					if(number % i == 0) {
						System.out.print(i+",");
					}		
				}		
			}else {
				System.out.print("輸入的整數需介於1~100間，請重新輸入");
				}
			System.out.println();
		}
	}
}
