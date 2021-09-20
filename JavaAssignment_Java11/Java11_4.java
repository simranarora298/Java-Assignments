package capg.co;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java11_4 {

	public static void main(String[] args) {
		
		int count=0;
        try
        {    
        	Scanner sc = new Scanner(new File("C:\\Users\\SIMRAN ARORA\\Desktop\\capgemini_training\\Core Java\\Java11Assignments_StudentList.txt"));
            while(sc.hasNext())
            {
                String line = sc.next().trim();
                System.out.println(line);
                count+=1;
            }
            System.out.println("Number of students are : "+count);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

	}

}
