
public class area {
	public static void main(String[] args) {
		rectangular rec1 = new rectangular();
		rec1.setWidth(10);
		rec1.setHeight(20);
		System.out.println("Width: " + rec1.getWidth());
		System.out.println("Height: " + rec1.getHeight());
		System.out.println("Area: " + rec1.calcArea());
		System.out.println("-----");

		rectangular rec2 = new rectangular(8, 10);
		System.out.println("Width: " + rec2.getWidth());
		System.out.println("Width: " + rec2.getHeight());
		System.out.println("Area: " + rec2.calcArea());
	}
}