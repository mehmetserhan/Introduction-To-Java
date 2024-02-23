public class rectangular {

	private double width;
	private double height;
	
	public rectangular(){}

	public rectangular(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double calcArea(){
		return width*height;
	}

	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width = width;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		this.height = height;
	}
}