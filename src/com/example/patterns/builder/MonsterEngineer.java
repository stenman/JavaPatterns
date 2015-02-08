package com.example.patterns.builder;

public class MonsterEngineer {
	private MonsterBuilder monsterBuilder;

	public MonsterEngineer(MonsterBuilder monsterBuilder) {
		this.monsterBuilder = monsterBuilder;
	}

	public Monster getMonster() {
		return this.monsterBuilder.getMonster();
	}

	public void makeMonster() {
		this.monsterBuilder.buildMonsterHead();
		this.monsterBuilder.buildMonsterTorso();
		this.monsterBuilder.buildMonsterArms();
		this.monsterBuilder.buildMonsterLegs();
	}
}
