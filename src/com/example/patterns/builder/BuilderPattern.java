package com.example.patterns.builder;

public class BuilderPattern {

	public static void main(String[] args) {
		MonsterBuilder frankensteinsMonster = new FrankensteinsMonsterBuilder();
		MonsterBuilder werewolfMonster = new WerewolfMonsterBuilder();

		MonsterEngineer monsterEngineer;

		monsterEngineer = new MonsterEngineer(frankensteinsMonster);
		monsterEngineer.makeMonster();
		Monster firstMonster = monsterEngineer.getMonster();

		System.out.println("\nFirst monster built!");

		System.out.println("Monster head type: " + firstMonster.getMonsterHead());
		System.out.println("Monster torso type: " + firstMonster.getMonsterTorso());
		System.out.println("Monster arms type: " + firstMonster.getMonsterArms());
		System.out.println("Monster legs type: " + firstMonster.getMonsterLegs());

		monsterEngineer = new MonsterEngineer(werewolfMonster);
		monsterEngineer.makeMonster();
		Monster secondMonster = monsterEngineer.getMonster();

		System.out.println("\nSecond monster built!");

		System.out.println("Monster head type: " + secondMonster.getMonsterHead());
		System.out.println("Monster torso type: " + secondMonster.getMonsterTorso());
		System.out.println("Monster arms type: " + secondMonster.getMonsterArms());
		System.out.println("Monster legs type: " + secondMonster.getMonsterLegs());
	}

}
