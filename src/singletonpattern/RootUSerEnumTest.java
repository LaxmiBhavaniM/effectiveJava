package singletonpattern;

public class RootUSerEnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RootUserEnum user = RootUserEnum.SINGLETON;
		System.out.println(user.getName());
	}

}
