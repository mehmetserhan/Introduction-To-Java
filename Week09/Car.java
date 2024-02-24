public class Car {
    private Motor vhc = new Motor();

    public void start() {
       this.vhc.run();
       System.out.println(">>> The vehicle is running.");
    }
    
    public void stop() {
       this.vhc.stop();
       System.out.println(">>> The vehicle has stopped.");
    }
 
    public static void main(String[] var0) {
       Car var1 = new Car();
       var1.start();
       var1.stop();
    }
 }