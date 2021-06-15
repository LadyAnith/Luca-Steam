package utilities;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferData {

	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	public String saveString() throws Exception {
		String data = bf.readLine();
		return data;
	}
	
	public int saveInt() throws Exception {
		int data = Integer.parseInt(bf.readLine());
		return data;
	}
	
	public double saveDouble() throws Exception {
		double data = Double.parseDouble(bf.readLine());
		return data;
	}
	
}
