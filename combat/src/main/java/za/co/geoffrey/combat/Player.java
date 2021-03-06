package za.co.geoffrey.combat;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
public class Player {
    @Getter
    private String name;
    @Getter
    private int attack;
    private int defense;
    @Getter
    private int hitPoints;

    public void attack(final Monster monster) {
        monster.defend(this);
    }



}
