package com.example.patterns.builder;

public interface MonsterBuilder {
	public void buildMonsterHead();

	public void buildMonsterTorso();

	public void buildMonsterArms();

	public void buildMonsterLegs();

	public Monster getMonster();
}
