package inteface;
interface Unit07{
	public void attack();//공격
	public void defense();//방어
}
class A07 implements Unit07{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("지상군 공격");
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.println("지상군 방어");
	}
	
}
public class MainClass07 {
	public static void main(String[] args) {
		Unit07 a = new A07();
	}
}
