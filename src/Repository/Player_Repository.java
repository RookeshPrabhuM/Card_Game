package Repository;

import Entity.Card;
import Entity.Player;

import java.util.*;

public class Player_Repository implements IPlayer_Repository {
    private final Map<String, Player> PlayerMap;
    private Integer autoIncrement = 0;

    public Player_Repository(){
        PlayerMap = new HashMap<String,Player>();
    }

    public Player_Repository(Map<String, Player> playerMapMap) {
        this.PlayerMap = playerMapMap;
        this.autoIncrement = playerMapMap.size();
    }


    @Override
    public Player save(Player entity) {
        if( entity.getID() == null ){
            autoIncrement++;
            Player u = new Player(Integer.toString(autoIncrement),entity.getPlay_name(),entity.getCard(), entity.getNo_of_cards_at_start());
            PlayerMap.put(u.getID(),u);
            return u;
        }
        PlayerMap.put(entity.getID(),entity);
        return entity;
    }



    @Override
    public List<Player> findAll() {
        List<Player> all_player=new ArrayList<>();
        for (Map.Entry<String, Player> entry : PlayerMap.entrySet())
            all_player.add(entry.getValue());
        return all_player;
        //  return Collections.emptyList();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void delete(Player entity) {

    }

    @Override
    public void deleteById(String s) {

    }

    public Optional<Player> find_by_name(String name) {
        //    Optional<User> find_name=userMap.values().stream().filter(x->x.name.equals(name));
        // Optional<User> find_name=userMap.values().stream().filter(s->s.getName().equals(name));
        //  return Optional.of(userMap.values().stream().filter(s->s.getName().equals(name)).collect(Collectors.toList()));;
        // return Optional()
        // return Optional.of(userMap.get(name));
        return  PlayerMap.values().stream().filter(e->e.getPlay_name().equals(name)).findFirst();

    }
}
