package com.example.patterns.singleton;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {

    @Override
    public void run() {
        Singleton newInstance = Singleton.getInstance();
        System.out.println("Instance ID: " + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());
        LinkedList<String> playerTiles = newInstance.getTiles(7);
        System.out.println("Player: " + playerTiles);

        System.out.println("Got Tiles\n");
    }

}
