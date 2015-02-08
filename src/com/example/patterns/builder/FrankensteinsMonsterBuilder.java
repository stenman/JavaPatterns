package com.example.patterns.builder;

public class FrankensteinsMonsterBuilder implements MonsterBuilder {

	private Monster monster;

	public FrankensteinsMonsterBuilder() {
		this.monster = new Monster();
	}

	@Override
	public void buildMonsterHead() {
		monster.setMonsterHead("Head with black, water-combed hair and bolts");

	}

	@Override
	public void buildMonsterTorso() {
		monster.setMonsterTorso("Someone else's torso");
	}

	@Override
	public void buildMonsterArms() {
		monster.setMonsterArms("Someone else's arms");
	}

	@Override
	public void buildMonsterLegs() {
		monster.setMonsterLegs("Someone else's legs");
	}

	@Override
	public Monster getMonster() {
		return this.monster;
	}

}
