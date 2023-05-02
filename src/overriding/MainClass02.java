package overriding;

import java.util.ArrayList;

class A02 extends ArrayList<String>{
	String[] arr = new String[3];
	
	public void test() {	}

	@Override
	public boolean add(String e) {
		// TODO Auto-generated method stub
		System.out.println("추가");
		arr[0] = e;
		return true;
	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		System.out.println("실행");
		return arr[index];
	}
	
}

public class MainClass02 {
	public static void main(String[] args) {
		A02 a = new A02();
		a.add("gkdl");
		System.out.println(a.get(0));
		
		
		
		
	}
}
