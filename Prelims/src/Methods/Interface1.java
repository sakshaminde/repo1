package Methods;

public interface Interface1 {
	abstract void climb();
	default void add(int a, int b)
	{
		System.out.println("Addition is:"+(a+b));
	}

}
