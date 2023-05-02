package inteface;

class A05 {
	public void a05() {
		System.out.println("특정기능");
	}
}

interface Int05 {
	public void inte();
}

class B05 extends A05 implements Int05 {
	public void b05() {
		System.out.println("새로운 기능 추가");
	}

	@Override
	public void inte() {
		
		
		
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		B05 b = new B05();
		b.a05();
		b.b05();
	}
}
