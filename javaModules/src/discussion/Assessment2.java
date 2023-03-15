package discussion;

public class Assessment2 {

	public static void main(String[] args) {
		validate obj = (String userName, String password)->{
			System.out.println((userName.equals("ABC") && password.equals("DEF"))? true : false);
			return false;
		};
		obj.isValid("ABC","DEF");
	}

}
