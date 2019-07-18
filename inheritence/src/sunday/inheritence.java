package sunday;
class cars
{
	void company()
	{
		System.out.println("company");
	}
	
}
class scorpio extends cars
{
	void mahendra()
	{
		System.out.println("mahendra");
	}
}

class shift extends cars
{
	void maruthi()
	{
		System.out.println("maruthi");
	}
}
public class inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
scorpio a =new scorpio();
shift b=new shift();
a.mahendra();
b.maruthi();
b.company();
	}

}
