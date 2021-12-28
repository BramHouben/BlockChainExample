package com.Bram.Fontys;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        User user = new User("bram", "Houben", 410094, 500);
        User user2 = new User("Ming", "Janssen", 510094, 300);


        String[] users = {"Bram gives " + user.getMoney(), "ming gives " + user2.getMoney()};
        ArrayList<Block> blocks = new ArrayList<>();
        Block block = new Block(users, 0);
        blocks.add(block);

        System.out.println("1 block" + block);
        System.out.println("Blockchain" + blocks);

        String[] usersTrans = {"Bram gives Ming " + 50};
        Block secBlock = new Block(usersTrans, block.getBlockHash());
        blocks.add(secBlock);

        System.out.println("2 block" + secBlock);
        System.out.println("Blockchain" + blocks);

        String[] usersTrans2 = {"Ming gives Bram " + 70};
        Block thirdBlock = new Block(usersTrans2, secBlock.getBlockHash());
        blocks.add(thirdBlock);

        System.out.println("3 block" + thirdBlock);
        System.out.println("Blockchain" + blocks);
    }
}
