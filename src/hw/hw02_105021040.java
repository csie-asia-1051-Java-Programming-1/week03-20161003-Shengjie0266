package hw;
import java.util.Scanner;
public class hw02_105021040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = 0, b = 0, c = 0; 
		int i = 1;
		while(i==1){
			System.out.println("請輸入整數");
			int m = scn.nextInt();
		    if(m>0){
			 a=a+1;
		    }else 
		    if(m==0){
			 b=b+1;
		    }else
		    if(m<0){
			 c=c+1;
		    }System.out.println("是否繼續"+"是的話請按1,否的話請按2");
			int f = scn.nextInt();
			if(f==2){
			i=0;
		}
		}
		System.out.println("正數有:"+ a +"個");
		System.out.println("零有:"+ b +"個");
		System.out.println("負數有:"+ c +"個");
	}

}
