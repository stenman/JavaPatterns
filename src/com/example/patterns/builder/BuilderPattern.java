package com.example.patterns.builder;

public class BuilderPattern {

	public static void main(String[] args) {
		MonsterBuilder frankensteinsMonster = new FrankensteinsMonsterBuilder();

		MonsterEngineer monsterEngineer = new MonsterEngineer(frankensteinsMonster);

		monsterEngineer.makeMonster();

		Monster firstMonster = monsterEngineer.getMonster();

		System.out.println("Monster built!");

		System.out.println("Monster head type: " + firstMonster.getMonsterHead());
		System.out.println("Monster torso type: " + firstMonster.getMonsterTorso());
		System.out.println("Monster arms type: " + firstMonster.getMonsterArms());
		System.out.println("Monster legs type: " + firstMonster.getMonsterLegs());
	}

}
