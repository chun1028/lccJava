
public class Homework_0724_02 {
	public static void main(String[] args) {
		int[] num = {98, 67, 45, 43, 22, 12, 89, 33, 48, 85} ;
		System.out.print("陣列內10個整數分別為：");
		for(int i : num) {
			System.out.print(i +",");
		}
		System.out.println();
		System.out.print("10個整數遞增排序：");
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num.length ; j++) {
				if(num[i] < num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;					
				}
			}		
		}
		for(int i : num)
		System.out.print(i +",");
		
		System.out.println();
		System.out.print("10個整數遞減排序：");
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num.length ; j++) {
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;					
				}
			}		
		}
		for(int i : num)
		System.out.print(i +",");
				
	}

}
