package Exception;

public class Invalid_input extends RuntimeException{
    public Invalid_input()
    {
        super();
    }
    public Invalid_input(String msg)
    {
        super(msg);
    }
}
