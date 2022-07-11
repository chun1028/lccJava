/**
 * 請用 if .. else 判斷
 * java.util.Scanner
 * 請使用者輸入一個數字。
 * 判斷使用者輸入的數字是奇數？還是偶數？
 * 要印出來
 * 提示：請用 %  取餘數   可以被 ? 整除，餘數=0
 * 就會是偶數 ，不能被整除，就是奇數 
 * @author Rebecca
 */
public class Homework_0710 {
	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);		
		System.out.print("請輸入一個整數:");
		int num = scan.nextInt();
		
		if(num %2 == 0) {
			System.out.println(num+"是偶數");
		}else
			System.out.println(num +"是奇數");
		
		System.out.println("程式執行完畢");
	}
}
