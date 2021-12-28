package com.Bram.Fontys;

import java.util.Arrays;

public class Block {

    private String[] trans;
    private int blockHash;
    private int prevBlockHash;

    public Block(String[] trans, int prevBlockHash) {
        super();
        this.trans = trans;
        this.prevBlockHash = prevBlockHash;
        this.blockHash= Arrays.hashCode(new int[]{Arrays.hashCode(trans),this.prevBlockHash});
    }

    public String[] getTrans() {
        return trans;
    }

    public void setTrans(String[] trans) {
        this.trans = trans;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }

    public int getPrevBlockHash() {
        return prevBlockHash;
    }

    public void setPrevBlockHash(int prevBlockHash) {
        this.prevBlockHash = prevBlockHash;
    }

    @Override
    public String toString() {
        return "Block{" +
                "trans=" + Arrays.toString(trans) +
                ", blockHash=" + blockHash +
                ", prevBlockHash=" + prevBlockHash +
                '}';
    }
}
