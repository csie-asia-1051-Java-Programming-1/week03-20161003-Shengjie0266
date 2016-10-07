package hw;
import java.util.Scanner;
public class hw01_105021040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數值(不含0)");
		int n = scn.nextInt();
		int sum = 0;
		while (n>0){
			sum += 1;
			n = n/10;
		}
		System.out.println(sum);
	}

}
