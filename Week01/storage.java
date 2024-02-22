class storage{
	public static void main(String[] args){
	
		box box1 = new box();
		box box2 = new box();
	
        box1.x = 2.0;
        box1.y = 3.0;
        box1.z = 5.0;
        box1.isFragile = true;
        
        box2.x = 2.5;
        box2.y = 3.5;
        box2.z = 5.5;
        box2.isFragile = false;
        
        System.out.println("First box width: " + box1.x);
        System.out.println("First box lenght: " + box1.y);
        System.out.println("First box height: " + box1.z);
        System.out.println("First box volume: " + (box1.x * box1.y * box1.z));
        System.out.println("Is first box fragile? " + box1.isFragile);

        System.out.println("-------------------------------------");

        System.out.println("Second box width: " + box2.x);
        System.out.println("Second box lenght: " + box2.y);
        System.out.println("Second box height: " + box2.z);
        System.out.println("Second box volume: " + (box2.x * box2.y * box2.z));
        System.out.println("Is second box fragile? " + box2.isFragile);

	}
}