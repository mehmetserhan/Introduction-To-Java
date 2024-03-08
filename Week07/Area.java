public class Area {
	public static void main(String[] args) {
		Rectangular rec1 = new Rectangular();
		rec1.setWidth(10);
		rec1.setHeight(20);
		System.out.println("Width: " + rec1.getWidth());
		System.out.println("Height: " + rec1.getHeight());
		System.out.println("Area: " + rec1.calcArea());

		System.out.println("-----");

		Rectangular rec2 = new Rectangular(8, 10);
		System.out.println("Width: " + rec2.getWidth());
		System.out.println("Width: " + rec2.getHeight());
		System.out.println("Area: " + rec2.calcArea());
	}
}