
public class JavaDeveloper implements Developer{

	private final String name;
	
	JavaDeveloper(String name)
	{
		this.name = name;
	}
	@Override
	public void code() {
		// TODO Auto-generated method stub
		System.out.println("the java developer:"+this.name+" coding....");
	}

	@Override
	public void debug() {
		// TODO Auto-generated method stub
		System.out.println("the java developer:"+this.name+" debugging....");
		
	}

}
