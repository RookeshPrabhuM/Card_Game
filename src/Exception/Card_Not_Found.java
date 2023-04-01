package Exception;

public class Card_Not_Found extends RuntimeException {
    public Card_Not_Found(){
        super();
    }
    public Card_Not_Found(String msg) {
        super(msg);
    }

}
