package Service;

import Entity.Card;
import Entity.Player;

import java.util.List;

public interface IPlayer_Service {
    public void Drop_card(Card card1,Card card2);
    public void Draw_card(Card card1,Card card2);

    public Player create(String name, List<Card> cards);

}
