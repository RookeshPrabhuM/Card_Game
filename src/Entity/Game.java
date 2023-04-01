package Entity;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Game extends Base_Entity{

    private List<Player> player;
    private Special_Card specialCard;
    private Card_Type cardType;
    private Card_Color cardColor;




    public List<Player> getPlayer() {
        return player;
    }

    public Special_Card getSpecialCard() {
        return specialCard;
    }

    public Card_Type getCardType() {
        return cardType;
    }

    public Card_Color getCardColor() {
        return cardColor;
    }

    public List<Card> getCards() {
        return cards;
    }

    public Game_status getGameStatus() {
        return gameStatus;
    }

    private List<Card> cards;
    private  Game_status gameStatus;



    public Game(List<Player> player, List<Card> cards) {
        this.player = player;
        this.cards = cards;
    }



    public Game(String id, List<Player> player, Special_Card specialCard, Card_Type cardType, Card_Color cardColor, List<Card> cards, Game_status gameStatus) {
        this.ID=id;
        this.player = player;
        this.specialCard = specialCard;
        this.cardType = cardType;
        this.cardColor = cardColor;
        this.cards = cards;
        this.gameStatus = gameStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(player, game.player) && specialCard == game.specialCard && cardType == game.cardType && cardColor == game.cardColor && Objects.equals(cards, game.cards) && gameStatus == game.gameStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(player, specialCard, cardType, cardColor, cards, gameStatus);
    }

    @Override
    public String toString() {
        return "Game{" +
                "player=" + player +
                ", specialCard=" + specialCard +
                ", cardType=" + cardType +
                ", cardColor=" + cardColor +
                ", cards=" + cards +
                ", gameStatus=" + gameStatus +
                '}';
    }
}
