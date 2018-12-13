Feature: Player monster combat

  Scenario: A player attacking a monster depletes the monsters hit points
    Given A player equal to
      | attack | defense | name | hitPoints |
      | 50     | 20      | John | 200       |
    And A monster equal to
      | attack | defense | name      | hitPoints |
      | 50     | 20      | Wild Boar | 200       |
    When The player attacks the monster
    Then The monster's hit points decrease by the expected amount
  Scenario: A monster is killed when it takes more damage than it's hit points
    Given A player equal to
      | attack | defense | name | hitPoints |
      | 50     | 20      | John | 200       |
    And A monster equal to
      | attack | defense | name      | hitPoints |
      | 50     | 20      | Wild Boar | 200       |
    When The player attacks the monster until it has no hit points
    Then The monster should be dead