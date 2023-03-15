package javaModules.String;

public class StringBuf {

	public static void main(String[] args) {
		String obj = "Java";
		System.out.println(obj);
		System.out.println(obj.concat("World"));
		System.out.println(obj);

		System.out.println("------------------------");
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		System.out.println(sb.append("World"));
		System.out.println(sb);

	}

}
