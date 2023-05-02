package inteface;
/*
up casting()
 - 부모 형태로 변환하는 것
 - 코드를 간결하게 줄일 수 있다
down casting
 - 부모 -> 자기자신으로 형 변환하는 것
 
*/
class Parents{
	public void familyName() {
		System.out.print("이 ");
	}
	public void name() {
		familyName();
		System.out.println("순신");
	}
}
class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("a");
	}
}
class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("b");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
//		Parents p = new Parents();
//		p.name();
//		Daughter d = new Daughter();
//		d.name();
//		Son s = new Son();
//		s.name();
		
		//up casting
		Parents p = new Parents();
		p.name();
		p = new Daughter();
		p.name();
		p = new Son();
		p.name();
		
		
	}
}
