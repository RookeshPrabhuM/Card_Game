package Service;

import Entity.*;
import Repository.IPlayer_Repository;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Player_service implements IPlayer_Service{
    private IPlayer_Repository playerRepository;
    private IGame_service gameService;
    private Special_Card specialCard;

    private int initial_card_count_of_players=5;
    public Player create(String name, List<Card> cards){
        Player player=new Player(name,cards);
        return playerRepository.save(player);
    }

    List<Player>list=playerRepository.findAll().stream().sorted().collect(Collectors.toList());


    public void Draw_card(Card card1,Card card2){
        if(card1.getType()!=card2.getType())
        {
            int a=gameService.Balance_deck_at_start()-1;
            initial_card_count_of_players++;
        }
        else if(card1.getSpecial_type()!=card2.getSpecial_type())
        {
            int a=gameService.Balance_deck_at_start()-1;
            initial_card_count_of_players++;
        }

    }

    public void Drop_card(Card card1,Card card2){
        if(card1.getType()==card2.getType())
        {

            initial_card_count_of_players--;
        }
        else if(card1.getSpecial_type()==card2.getSpecial_type())
        {
            if(card1.getSpecial_type()==Special_Card.Ace)
            {
               Iterator<Player> s=list.iterator();
               s.next();
                initial_card_count_of_players--;
            }
            if(card1.getSpecial_type()==Special_Card.Kings)
            {
                list.stream()
                        .sorted(Collections.reverseOrder())
                        .collect(Collectors.toList());
                initial_card_count_of_players--;
            }
            if(card1.getSpecial_type()==Special_Card.Queens){
                initial_card_count_of_players++;
                initial_card_count_of_players++;
            }


        }
            if(card1.getSpecial_type()==Special_Card.Ace){
                initial_card_count_of_players++;
                initial_card_count_of_players++;
                initial_card_count_of_players++;
                initial_card_count_of_players++;


            }

    }

}
