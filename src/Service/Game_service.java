package Service;

import Entity.Card;
import Entity.Game;
import Entity.Player;
import Repository.ICard_Repository;
import Repository.IGame_Repository;

import java.util.List;

public class Game_service implements  IGame_service{
    private IGame_Repository gameRepository;
    private Player player;
    private Card card;
    private ICard_Repository cardRepository;

    public Game_service(IGame_Repository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public int Balance_deck_at_start(){
        return  (52-(player.getNo_of_players()*5));
    }

    @Override
    public int final_Balance_deck() {
        return 0;
    }

    @Override
    public int cards_count_of_each_player() {
        return 0;
    }

    public Game create(List<Player> player, List<Card> cards){
        Game game=new Game(player,cards);
        return gameRepository.save(game);

    }
}
