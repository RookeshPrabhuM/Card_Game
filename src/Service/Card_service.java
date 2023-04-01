package Service;

import Entity.Card;
import Entity.Card_Color;
import Entity.Card_Type;
import Entity.Special_Card;
import Repository.ICard_Repository;

public class Card_service implements ICard_service{
    private ICard_Repository cardRepository;

    public Card_service(ICard_Repository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public Card create_Card(Card_Type type, int card_no, Card_Color card_color){
        Card c=new Card(type,card_no,card_color);
        return cardRepository.save(c);
    }

    @Override
    public Card create_Card(Card_Type type, Special_Card special_type, Card_Color card_color){
        Card c=new Card(type,special_type,card_color);
        return cardRepository.save(c);
    }
}
