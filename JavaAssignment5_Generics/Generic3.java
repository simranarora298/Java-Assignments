public class Generic3 
{
	public static void main(String[] args) 
	{
		String[] str= {"A","B","C","D","E","F","G","H","I"};
		Swapping.swap(str,3,5);
		
		for(String s:str)
		System.out.println(s);
	}
}

class Swapping
{
	public static <T> void swap(T[] arr,int i, int j)
	{
		T temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}

