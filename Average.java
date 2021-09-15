import java.util.Scanner;

public class Average 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i,j;
		int s1[] = new int[3];
		int s2[] = new int[3];
		int s3[] = new int[3];
		System.out.println("Enter marks of Student 1 in 3 subjects:");
		for(i=0;i<3;i++)
		{
			s1[i]=sc.nextInt();
		}
		System.out.println("Enter marks of Student 2 in 3 subjects:");
		for(i=0;i<3;i++)
		{
			s2[i]=sc.nextInt();
		}
		System.out.println("Enter marks of Student 3 in 3 subjects:");
		for(i=0;i<3;i++)
		{
			s3[i]=sc.nextInt();
		}
		System.out.println("Student1 total Score " + total(s1[0],s1[1],s1[2]));
        System.out.println("Student1 avg Score " + avg(s1[0],s1[1],s1[2]));
        System.out.println("Student2 total Score " + total(s2[0],s2[1],s2[2]));
        System.out.println("Student2 avg Score " + avg(s2[0],s2[1],s2[2]));
        System.out.println("Student3 total Score " + total(s3[0],s3[1],s3[2]));
        System.out.println("Student3 avg Score " + avg(s3[0],s3[1],s3[2]));
		for(j= 0;j<3;j++)
		{
			System.out.println("Avg Score of Subject"+(j+1)+": "+(avg(s1[j],s2[j],s3[j])));
		}
		for(j= 0;j<3;j++)
		{
			System.out.println("Total Score of Subject"+(j+1)+": "+(total(s1[j],s2[j],s3[j])));
		}
		
		

	}
	static int avg(int a, int b ,int c)
	{
		return (total(a,b,c)/3);
	}
	static int total(int a , int b , int c)
	{
		return (a+b+c);
	}
}
