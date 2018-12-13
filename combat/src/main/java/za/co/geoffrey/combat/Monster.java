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
    private boolean isDead;

    public void defend(final Player player) {
        if (this.isAlive()) {
            this.hitPoints = this.hitPoints - (player.getAttack() - this.defense);
            this.isDead = hitPoints <= 0;
        }
    }

    public boolean isDead() {
        return isDead;
    }

    public boolean isAlive() {
        return !isDead;
    }
}
