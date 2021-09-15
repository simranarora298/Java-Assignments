public class InsertSB {
	public static void main(String[] args) {
		StringBuilder st = new StringBuilder("It is used to _ at the specified index position");
        st.replace(st.indexOf("_"),st.indexOf("_")+1,"insert text");
        System.out.println(st);
	}
}
