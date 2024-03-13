public class ExceptionA extends Exception {
    private int id;

    public ExceptionA(){}

    public ExceptionA(String info, int id){
        super(info);
        this.id = id;
    }

    public String getLocalizedMessage(){
        switch(id){
            case 0: return "Important error !!!";
            case 1: return "Negligible error.";
            default: return "Undefined Error !?";
        }
    }

    public int getId(){
        return id;
    }
}
