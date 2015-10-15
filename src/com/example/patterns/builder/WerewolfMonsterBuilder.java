package com.example.patterns.builder;

public class WerewolfMonsterBuilder implements MonsterBuilder {

    private Monster monster;

    public WerewolfMonsterBuilder() {
        this.monster = new Monster();
    }

    @Override
    public void buildMonsterHead() {
        monster.setMonsterHead("Hairy head with pointy teeth");

    }

    @Override
    public void buildMonsterTorso() {
        monster.setMonsterTorso("Hairy and muscular");
    }

    @Override
    public void buildMonsterArms() {
        monster.setMonsterArms("Hairy with claws");
    }

    @Override
    public void buildMonsterLegs() {
        monster.setMonsterLegs("Hairy with claws");
    }

    @Override
    public Monster getMonster() {
        return this.monster;
    }


}
