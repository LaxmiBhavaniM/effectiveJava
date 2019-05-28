package singletonpattern;

public class RootUserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RootUser user1 = RootUser.getInstance();
		RootUser user2 = RootUser.getInstance();
		System.out.println(user1==user2);
	}

}
