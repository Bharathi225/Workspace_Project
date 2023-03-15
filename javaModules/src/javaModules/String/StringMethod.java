package javaModules.String;

public class StringMethod {

	public static void main(String[] args) {
		//trim()
		String s1 =" ja va ";
		System.out.println(s1.trim()); //remove space start and end
		
		//equals()
		String s2 ="username";
		String s3 ="Username";
		System.out.println(s2.equals(s3));

		//stripLeading()
		//String s4 =" java ";
		//System.out.println(s4.stripLeading()); //remove space start
		
		//StringBuffer()
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		sb.append("world");
		System.out.println(sb);
		System.out.println(sb.hashCode());
				
		StringBuffer sb1 = new StringBuffer("17");
		System.out.println(sb1.hashCode());
		System.out.println(sb1);
		sb1.append("12");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.capacity());
		sb2.ensureCapacity(20);
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer(12);
		System.out.println(sb3.capacity());
		
		
	}

}
