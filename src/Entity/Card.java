package Entity;

import java.util.Objects;
import Exception.Card_Not_Found;

public class Card extends Base_Entity{
    private Card_Type type;
    private Special_Card special_type;
    private int card_no;
    private Card_Color card_color;

    public Card(String id,Card_Type type, int card_no, Card_Color card_color) {
        this.ID=id;
        this.type = type;
        this.card_no = card_no;
        this.card_color = card_color;

    }
    public Card(String id,Card_Type type,Special_Card card, Card_Color card_color) {
        this.ID=id;
        this.type = type;
        this.special_type=card;
        this.card_color = card_color;

    }

    public Card(Card_Type type, int card_no, Card_Color card_color) {
        this.type = type;
        if(card_no>1 || card_no<11)
        {
            this.card_no = card_no;
        }
        else{
            throw new Card_Not_Found("invalid Card Type");
        }
//        this.card_no = card_no;
        this.card_color = card_color;
    }

    public Card( Card_Type type, Special_Card special_type, Card_Color card_color) {

        this.type = type;
        this.special_type = special_type;


        this.card_color = card_color;
    }

    public Card(Card_Type type, Special_Card special_type, int card_no, Card_Color card_color) {
        this.type = type;
        this.special_type = special_type;
        this.card_no = card_no;
        this.card_color = card_color;
    }

    public Card_Type getType() {
        return type;
    }

    public Special_Card getSpecial_type() {
        return special_type;
    }

    public int getCard_no() {
        return card_no;
    }

    public Card_Color getCard_color() {
        return card_color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return card_no == card.card_no && type == card.type && special_type == card.special_type && card_color == card.card_color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, special_type, card_no, card_color);
    }

    @Override
    public String toString() {
        return "Card{" +
                "type=" + type +
                ", special_type=" + special_type +
                ", card_no=" + card_no +
                ", card_color=" + card_color +
                '}';
    }
}
