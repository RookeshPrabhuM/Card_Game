package Repository;

import Entity.Game;

import java.util.HashMap;
import java.util.Map;

public class Game_Repository implements IGame_Repository{
    private final Map<String, Game> GameMap;
    private Integer autoIncrement = 0;



    public Game_Repository() {
        GameMap = new HashMap<String,Game>();
    }

    public Game_Repository(Map<String, Game> GameMap) {
        this.GameMap= GameMap;
        this.autoIncrement = GameMap.size();
    }

    @Override
    public Game save(Game entity) {
        if( entity.getID()== null ){
            autoIncrement++;
            Game c = new Game(Integer.toString(autoIncrement),entity.getPlayer(),entity.getSpecialCard(),entity.getCardType(),
                    entity.getCardColor(),entity.getCards(),entity.getGameStatus());
            GameMap.put(c.getID(),c);
            return c;
        }
        GameMap.put(entity.getID(),entity);
        return entity;
    }


}
