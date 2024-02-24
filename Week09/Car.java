public class Car{
    private Motor vhc = new Motor();
    public void start(){
        vhc.run();
        System.out.println(">>> The vehicle is running.");
    }
    public void stop(){
        vhc.stop();
        System.out.println(">>> The vehicle has stopped.");
    }
    public static void main(String args[]){
        Car car = new Car();
        car.start();
        car.stop();
    }
}