package com.example.patterns.builder;

public class Monster implements MonsterPlan {

	private String monsterHead;
	private String monsterTorso;
	private String monsterArms;
	private String monsterLegs;

	public String getMonsterHead() {
		return monsterHead;
	}

	public String getMonsterTorso() {
		return monsterTorso;
	}

	public String getMonsterArms() {
		return monsterArms;
	}

	public String getMonsterLegs() {
		return monsterLegs;
	}

	@Override
	public void setMonsterHead(String head) {
		monsterHead = head;
	}

	@Override
	public void setMonsterTorso(String torso) {
		monsterTorso = torso;
	}

	@Override
	public void setMonsterArms(String arms) {
		monsterArms = arms;
	}

	@Override
	public void setMonsterLegs(String legs) {
		monsterLegs = legs;
	}
}
