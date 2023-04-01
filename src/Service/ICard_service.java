package Service;

import Entity.Card;
import Entity.Card_Color;
import Entity.Card_Type;
import Entity.Special_Card;

public interface ICard_service {
    public Card create_Card(Card_Type type, int card_no, Card_Color card_color);
    public Card create_Card(Card_Type type, Special_Card special_type, Card_Color card_color);

}
