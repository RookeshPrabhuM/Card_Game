package Repository;

import Entity.Player;

import java.util.Optional;

public interface IPlayer_Repository extends CRUDRepository<Player,String>{

    public Optional<Player> find_by_name(String name);

}
