package overriding;

import java.util.ArrayList;

class A03{
	
}
class B03 extends A03{
	
}
class C03{
	int age;
	String name;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
}

public class MainClass03 {
	public static void main(String[] args) {
		Object b = new B03();
		int num = 100;
		Object n = 100;
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		C03 c = new C03();
		c.age = 20;
		c.name = "kim";
		System.out.println(c);
		System.out.println(c.toString());
		System.out.println(arr);
		System.out.println(arr.toString());
		
	}
}
