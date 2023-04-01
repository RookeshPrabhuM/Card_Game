package Service;

import Entity.Card;
import Entity.Game;
import Entity.Player;

import java.util.List;

public interface IGame_service {

    public Game create(List<Player> player, List<Card> cards);
    public int Balance_deck_at_start();
    public int final_Balance_deck();

    public int cards_count_of_each_player();
}
