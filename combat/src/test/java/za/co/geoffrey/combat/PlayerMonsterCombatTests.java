package za.co.geoffrey.combat;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PlayerMonsterCombatTests {
    @Test
    public void playerAttacksMonster() {
        final Player player = Player
                .builder()
                .attack(50)
                .defense(20)
                .name("John")
                .hitPoints(200)
                .build();
        final Monster monster = Monster
                .builder()
                .attack(50)
                .defense(20)
                .name("Wild Boar")
                .hitPoints(200)
                .build();

        final int expectedHitPoints = monster.getHitPoints() - (player.getAttack() - monster.getDefense());
        System.out.println("Attacking monster");
        player.attack(monster);
        assertThat(monster.getHitPoints(), is(equalTo(expectedHitPoints)));
    }

    @Test
    public void monsterCanBeKiller() {
        final Player player = Player
                .builder()
                .attack(50)
                .defense(20)
                .name("John")
                .hitPoints(200)
                .build();
        final Monster monster = Monster
                .builder()
                .attack(50)
                .defense(20)
                .name("Wild Boar")
                .hitPoints(200)
                .build();

        for (int i = 0; i < 8; i++) {
            player.attack(monster);
        }
        assertThat(monster.isDead(),is(equalTo(true)));
        assertThat(monster.isAlive(),is(equalTo(false)));
    }
}
