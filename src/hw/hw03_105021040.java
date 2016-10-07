package hw;
import java.util.Scanner;
public class hw03_105021040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int n = scn.nextInt();
		int sum = 1;
		for (int i = 1;i <= n;i++){
		sum = sum * i;
		}
		System.out.println(sum);
	}
}
