package Repository;

import Entity.Card;
import Entity.Game;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Card_Repository implements ICard_Repository{
    private final Map<String, Card> CardMap;
    private Integer autoIncrement = 0;

    public Card_Repository(){

        CardMap = new HashMap<String,Card>();
    }

    public Card_Repository(Map<String, Card> CardMap) {
        this.CardMap = CardMap;
        this.autoIncrement = CardMap.size();
    }

    @Override
    public Card save(Card entity) {
        if(entity.getSpecial_type()==null){
            if( entity.getID() == null ){
                autoIncrement++;
                Card q = new Card(Integer.toString(autoIncrement),entity.getType(),entity.getCard_no(),entity.getCard_color());
                CardMap.put(q.getID(),q);
                return q;
            }

        }
        else {
            if (entity.getID() == null) {
                autoIncrement++;
                Card q = new Card(Integer.toString(autoIncrement), entity.getType(), entity.getSpecial_type(), entity.getCard_color());
                CardMap.put(q.getID(), q);
                return q;
//                String id,Card_Type type,Special_Card card, Card_Color card_color

            }
        }

        CardMap.put(entity.getID(),entity);
        return entity;
    }

    @Override
    public List<Card> findAll(){
        List<Card> allCard=new ArrayList<Card>();
        for (Map.Entry<String, Card> entry : CardMap.entrySet())
            allCard.add(entry.getValue());
        return allCard;
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void delete(Card entity) {

    }

    @Override
    public void deleteById(String s) {

    }



}
