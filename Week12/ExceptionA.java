public class ExceptionA extends Exception {
    private int id;

    public ExceptionA(){
    }

    public ExceptionA(String info){
        super(info);
    }

    public ExceptionA(String info, int id){
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