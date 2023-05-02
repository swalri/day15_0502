package inteface;

import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		Unit08 un;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 지상군 2. 공군");
		int num = scan.nextInt();
		if(num ==1) {
			System.out.println("지상");
			un = new A08지상군();
		}else {
			System.out.println("공군");
			un = new B08공군();
		}
		System.out.println("1. 공격 2. 방어");
		int choice = scan.nextInt();
		
		if(choice ==1) {
			un.attack();
		}else if (choice ==2) {
			un.defense();
		}
		
		
	}
}
