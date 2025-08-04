package wrapper;

public class Wrapperclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double d1=new Double(1234.0);
		Double d2=new Double(1234);
		System.out.println(d1==d2);
        System.out.println(d1.equals(d2));
        System.out.println(d1.hashCode(d1));
        System.out.println(d1.hashCode(d2));
	}

}
