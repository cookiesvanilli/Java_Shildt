package com.shildt;

class Factorial {
    int fact(int n) {
        int result;
        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Factorial 3 = " + f.fact(3)); //6
        System.out.println("Factorial 4 = " + f.fact(4)); //24
        System.out.println("Factorial 5 = " + f.fact(5)); //120
    }
}

class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    }

    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "]" + values[i - 1]);
    }
}

class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;
        for (i = 0; i < 10; i++) ob.values[i] = i;
        ob.printArray(10);
    }
}
