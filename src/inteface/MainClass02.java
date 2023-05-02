package inteface;

import java.util.ArrayList;

class A01{
	public void aa() {}
}
class B01 extends A01{
	public void aa() {}
	public void test() {}
}

public class MainClass02 {
	public static void main(String[] args) {
		//down casting
		A01 a = new B01();
		B01 b = (B01)a;
		a.aa();
		
		ArrayList arr = new ArrayList<>();
		arr.add(111);
		arr.add("ㅁㅁㅁㅁ");
		arr.add(1.111);
		
		System.out.println(arr);
	}
}
