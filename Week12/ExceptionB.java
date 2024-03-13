public class ExceptionB extends Exception {
    private int id;

    public ExceptionB(){}

    public ExceptionB(String info){
        super(info);
    }

    public ExceptionB(String info, int id){
        super(info);
        this.id = id;
    }

    public String getLocalizedMessage(){
        switch(id){
            case 0: return "Negligible Error.";
            case 1: return "Error !";
            case 2: return "Important Error !!!";
            default: return "Undefined Error !?";
        }
    }

    public int getId(){
        return id;
    }
}