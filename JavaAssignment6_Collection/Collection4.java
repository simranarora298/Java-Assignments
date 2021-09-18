package capg.co;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Collection4 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException 
	{
		LinkedList<Date> date=new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in 'dd/mm/yyyy' format:");
		date.add(new SimpleDateFormat("dd/MM/yyyy").parse(sc.next()));
		//d.add(new Date(02/04/2021));
		//d.add(new Date(23/08/2012));
		//d.add(new Date(15/07/2009));
	
		for(Date d: date) 
		{
			if(Year.of(d.getYear()).isLeap())
				System.out.println("date is a leap year");
			else
				System.out.println("date is not a leap year");
		}
	
	}

}
