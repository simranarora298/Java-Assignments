package capg.co;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java11_3 {

	public static void main(String[] args) 
	{
		String str=new String("A quick brown fox jumps over the lazy dog");
		
		List<String> listStr= new ArrayList<>(Arrays.asList(str.split(" ")));
		Object[] newStr=listStr.toArray();
		
		for(Object sn: newStr)
		System.out.println(sn);
	}
}