
public class ProgramReverse {

	public static void main(String[] args) {
		String a="The quick brown fox jumps over a lazy dog";
		//String s = "sample";
		String result = new StringBuffer(a).reverse().toString();
		System.out.println(result);
	}

}
