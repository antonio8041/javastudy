package ch08;

public class UserInfoTest {

	public static void main(String[] args) {
		
		UserInfo user1 = new UserInfo();
		user1.userTall = 180;
		user1.userWeight = 78;
		user1.userSex = "Man";
		user1.userName = "Tomas";
		user1.userAge = 37;
		
		System.out.println(user1.showUserInfo());
	}

}
