package com.shildt.Interfaces;

class AI {
    public interface NestefInterface {
        boolean isNotNegative(int x);
    }
}

class BI implements AI.NestefInterface {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

public class NestedInterface {
    public static void main(String[] args) {
        AI.NestefInterface nif = new BI();
        if (nif.isNotNegative(10)) {
            System.out.println("good");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("bad");
        }
    }
}
