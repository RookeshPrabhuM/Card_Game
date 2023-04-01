package Entity;

import java.util.List;
import Exception.Invalid_input;

public class Player extends Base_Entity {
    private String Play_name;
    private List<Card> card;
    private int No_of_cards_at_start;
    private int No_of_players;

    private void add_card(Card cards){
        card.add(cards);
    }

    public String getPlay_name() {
        return Play_name;
    }

    public void setNo_of_players(int no_of_players) {

          if(no_of_players>1)
          {
              if(no_of_players<=4)
              {
                  No_of_players = no_of_players;
              }
          }
          else{
              throw new Invalid_input("The input  Entered is InValid!");
          }


    }

    public List<Card> getCard() {
        return card;
    }

    public int getNo_of_cards_at_start() {
        return No_of_cards_at_start;
    }

    public int getNo_of_players() {
        return No_of_players;
    }

    public Player(String id,String play_name, List<Card> card) {
        this.ID=id;
        this.Play_name=play_name;
        this.card = card;
    }

    public Player(String play_name, List<Card> card) {
        Play_name = play_name;
        this.card = card;
    }

    public Player(String id, String play_name, List<Card> card, int no_of_cards_at_start) {
        this.ID=id;
        this.Play_name=play_name;
        this.card = card;
        if(no_of_cards_at_start==5)
        {
            No_of_cards_at_start = no_of_cards_at_start;
        }
    }

    public void Remove_card(Card cards){
        card.removeIf(c -> c.getID() == cards.getID());
    }
}
