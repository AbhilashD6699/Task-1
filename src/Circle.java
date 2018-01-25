
public class Circle {

	public static void main(String[] args) {
		Parameter p = new Parameter(5);
		p.calc_area();
		System.out.println("diameter" +p.diameter());
		System.out.println("circumference" +p.circumference());
	}
}
