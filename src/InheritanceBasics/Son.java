package InheritanceBasics;

public class Son extends Grandfather{
	
	public void duty()
	{
		System.out.println("Gets ready to office");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son s = new Son();
		s.hobby();
		Grandfather gf = new Grandfather();
		gf.place();
		
		
	}

}
