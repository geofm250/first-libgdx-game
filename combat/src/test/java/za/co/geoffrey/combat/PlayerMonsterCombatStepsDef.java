package za.co.geoffrey.combat;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PlayerMonsterCombatStepsDef {
    private Player player;
    private Monster monster;
    private int expectedHitPoints;

    @Given("A player equal to")
    public void aPlayerEqualTo(final Player player) {
        this.player = player;
    }

    @And("A monster equal to")
    public void aMonsterEqualTo(final Monster monster) {
        this.monster = monster;
        this.expectedHitPoints = monster.getHitPoints() - (player.getAttack() - monster.getDefense());
    }

    @When("The player attacks the monster")
    public void thePlayerAttacksTheMonster() {
        player.attack(monster);
    }

    @Then("The monster's hit points decrease by the expected amount")
    public void theMonsterSHitPointsDecreaseByTheExpectedAmount() {
        assertThat(monster.getHitPoints(), is(equalTo(expectedHitPoints)));
    }

    @When("The player attacks the monster until it has no hit points")
    public void thePlayerAttacksTheMonsterUntilItHasNoHitPoints() {
        while (monster.getHitPoints() > 0) {
            player.attack(monster);
        }
    }

    @Then("The monster should be dead")
    public void theMonsterShouldBeDead() {
        assertThat(monster.isDead(), is(equalTo(true)));
        assertThat(monster.isAlive(), is(equalTo(false)));
    }
}
