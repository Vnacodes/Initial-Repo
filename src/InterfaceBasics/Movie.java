package InterfaceBasics;

public class Movie implements Recording{
	
	public void song()
	{
		System.out.println("Grey waala shade");
	}
	
	public void dance()
	{
		System.out.println("Dhyaanchand");
	}
	
	public void music()
	{
		System.out.println("Amit Trivedi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie m = new Movie();
		Recording r = new Movie();
		m.music();
		r.dance();
		r.song();
		

	}

}