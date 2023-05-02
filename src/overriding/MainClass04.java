package overriding;
final class A04{
	public void test() {
		System.out.println("부모");
	}
}
class B04{
	A04 a = new A04();
	String s;
	public void test() {
		a.test();
		System.out.println("자식");
	}
	
}
public class MainClass04 {
	public static void main(String[] args) {
		B04 b = new B04();
		b.test();
	}
}
