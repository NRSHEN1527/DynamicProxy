import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.lang.reflect.Proxy;

public class JavaDynamicProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("fd");
//		Class<?>[] cls = str.getClass().getInterfaces();
//		for(Class<?> c : cls)
//			System.out.println(c.getName());
		
		Constructor<?>[] css = str.getClass().getConstructors();
		for(Constructor<?> cs : css)
		{
			System.out.print(cs.getName()+":");
			Parameter[] pars = cs.getParameters();
			for(Parameter p : pars)
				System.out.print(p.getType().getName()+" "+p.getName()+" ");
			System.out.println();
		}
		
		
		
		
		Developer dev = new JavaDeveloper("nrshen");
		dev.code();
		dev.debug();
		System.out.println("----------------------");
		
		Developer devproxy = (Developer)Proxy.newProxyInstance(dev.getClass().getClassLoader(), dev.getClass().getInterfaces(), (proxy,method,argss)->{
			if(method.getName().equals("code"))
			{
				System.out.println("dev is praving for the debug..");
				return method.invoke(dev, argss);
			}
			if(method.getName().equals("debug"))
			{
				System.out.println("dev has no bug");
				return null;
			}
			return null;
		});
		devproxy.code();
		devproxy.debug();
	}

}
