public class Generic4 
{
	public static void main(String[] args) 
	{
		Pair<String,String> pair1=new Pair<>();
		pair1.setKey("1");
		pair1.setValue("ONE");
		System.out.println(pair1.getKey()+"\t"+pair1.getValue());
		
		Pair<String,java.util.Date> pair2=new Pair<>();
		pair2.setKey("2");
		pair2.setValue(new java.util.Date());
		System.out.println(pair2.getKey()+"\t"+pair2.getValue());
	}

}
class Pair<T1,T2>
{
	T1 key;
	T2 value;
	
	public T1 getKey() {
		return key;
	}
	public T2 getValue() {
		return value;
	}
	public void setKey(T1 key) {
		this.key = key;
	}
	public void setValue(T2 value) {
		this.value = value;
	}
}

