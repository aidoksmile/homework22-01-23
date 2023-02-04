package Game;

import Game.Shields.MetallShield;
import Game.Shields.NoneShield;
import Game.Shields.WoodShield;
import Game.Weapons.Bow;
import Game.Weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Team<Swordman> team1 = new Team<>();
        team1.addWarriorToTeam(new Swordman("Vasya", 250, new Sword(25), new MetallShield(50)))
                .addWarriorToTeam(new Swordman("John", 200, new Sword(50), new MetallShield(45)));

        for (Swordman swordman : team1) {
            System.out.println(swordman);
        }
        System.out.println("________");
        Team<Archer> team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("Kolya", 150, new Bow(100, 50), new NoneShield(0)))
                .addWarriorToTeam(new Archer("Poul", 200, new Bow(75, 70), new NoneShield(0)));

        for (Archer archer : team2) {
            System.out.println(archer);
        }
        System.out.println("________");
        System.out.println("Max range of Swordmans: " + team1.maxTeamRange());
        System.out.println("Max range of Archers: " + team2.maxTeamRange());
    }
}