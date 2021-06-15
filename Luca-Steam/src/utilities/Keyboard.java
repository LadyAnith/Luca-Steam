package utilities;

import java.util.Scanner;

public class Keyboard {
	
	@SuppressWarnings("resource")
	public static String saveString() throws Exception {
		String data = new Scanner(System.in).nextLine();
		return data;
	}

	public static String saveString(String msg) throws Exception {
		System.out.println(msg);
		return saveString();
	}
	
	@SuppressWarnings("resource")
	public static int saveInt() throws Exception {
		int data = new Scanner(System.in).nextInt();
		return data;
	}
	
	public static int saveInt(String msg) throws Exception {
		System.out.print(msg);
		return Keyboard.saveInt();
	}

	@SuppressWarnings("resource")
	public static double saveDouble()  throws Exception {
		double data = new Scanner(System.in).nextDouble();
		return data;
	}
	
	public static double saveDouble(String msg) throws Exception {
		System.out.print(msg);
		return Keyboard.saveDouble();
	}



	



	



	
}

