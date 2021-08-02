package ch08;

public class UserInfo {
	
	public int userTall;
	public int userWeight;
	public String userSex;
	public String userName;
	public int userAge;
	
	
	public UserInfo() {
		
	}
	
	public String showUserInfo () {
		return "tall : " + userTall + "\nweight : " + userWeight + "\nuserSex : " + userSex + "\nname" + userName + "\nage : " + userAge;
	}
}
