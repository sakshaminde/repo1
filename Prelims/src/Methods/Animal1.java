package Methods;

public class Animal1 implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 a1 = new Animal1();
		a1.climb();
		a1.add(5,6);
	}

	@Override
	public void climb() {
		// TODO Auto-generated method stub
		System.out.println("Some animals climb on tree");
	}


}
