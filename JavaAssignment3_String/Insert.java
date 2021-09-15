public class Insert {

	public static void main(String[] args) {
		StringBuffer st=new StringBuffer("It is used to _ at the specified index postion.");
		st.replace(st.indexOf("_"),st.indexOf("_")+1,"insert text");
		System.out.println(st);
	}
}