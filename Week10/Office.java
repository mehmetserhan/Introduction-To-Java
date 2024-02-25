interface Worker{
    public void work();
}

class Manager implements Worker{
    public void work(){
        System.out.println("Manager is working");
    }
    public void haveMeeting(){
        System.out.println("Announcement: We are about to have a meeting!");
    }
}

class Programmer implements Worker{
    public void work(){
        System.out.println("Programmer is working");
    }
}

class CyberSec extends Programmer{
    public void work(){
        System.out.println("CyberSec is working");
    }
}

class Secretary implements Worker{
    public void work(){
        System.out.println("Secretary is working");
    }
}

public class Office{
    public static void workDay(Worker staff[]){ 
        for(int i=0; i<staff.length; i++)
            staff[i].work();
    }
    
    public static void main(String args[]){
        Worker staff[] = new Worker[4];
        staff[0] = new Manager();
        staff[1] = new Programmer();
        staff[2] = new CyberSec();
        staff[3] = new Secretary();
        workDay(staff);
    }
}
