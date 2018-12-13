package za.co.geoffrey.combat;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
public class Monster {
    private String name;
    private int attack;
    @Getter
    private int defense;
    @Getter
    private int hitPoints;

    public void defend(final Player player) {
        this.hitPoints = this.hitPoints - (player.getAttack() - this.defense);
    }
}
