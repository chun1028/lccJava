/**
 * 有一分數序列：2/1，3/2，5/3，8/5，13/8，21/13...求出這個數列的前20項之和
 */
public class Homework_0807_02 {
	public static float top(int m) {
		if(m == 1)
			return (float)2;
		if(m ==2) 
			return (float)3;
		else
		return top(m-1) + top(m-2);
	}
	
	public static float bottom(int n) {
		if(n == 1)
			return (float)1;
		if( n == 2)
			return (float)2;
		else
		return bottom(n-1) + bottom(n-2);
	}
	public static void main(String[] args) {
		float Top, Bottom;
		float Sum = 0;
		for(int i = 1 ; i <= 20; i++) {
			Top = top(i);
			Bottom = bottom(i);
			Sum += Top / Bottom;
		}
		    
		System.out.printf("分數序列：2/1，3/2，5/3，8/5，13/8，21/13...前20項之和為%f",Sum);	
				
	}
	
}
