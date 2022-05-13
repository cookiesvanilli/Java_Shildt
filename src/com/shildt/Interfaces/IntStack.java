package com.shildt.Interfaces;

interface IntStack {
    void push(int item); // сохранить элемент в стеке

    int pop(); // извлечь элемент из стека

}

//реализация интерфейса IntStack для стека фиксированного размера
class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is not loaded");
            return 0;
        } else {
            return stck[tos--];
        }
    }

}

class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        System.out.println("Stack in mystack1: 5-0");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack in mystack2: 8-0");
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack2.pop());
        }
    }
}

//реализация "наращиваемого" стека
class DynStack implements IntStack {
    private int stck[];
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }


    public void push(int item) {
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        } else {
            stck[++tos] = item;
        }

    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is not loaded");
            return 0;
        } else {
            return stck[tos--];
        }
    }

}

class IFTest2 {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);

        for (int i = 0; i < 12; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);

        System.out.println("Stack in mystack1: 12-0");
        for (int i = 0; i < 12; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack in mystack2: 20-0");
        for (int i = 0; i < 20; i++) {
            System.out.println(mystack2.pop());
        }
    }
}

// создать переменную интерфейса и обратиться к стекам через нее.
class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds;
        for (int i = 0; i < 12; i++) {
            mystack.push(i);
        }

        mystack = fs;
        for (int i = 0; i < 8; i++) {
            mystack.push(i);
        }

        mystack = ds;
        System.out.println("Values in the dynamic stack");
        for (int i = 0; i < 12; i++) {
            System.out.println(mystack.pop());
        }

        mystack = fs;
        System.out.println("Values in a fixed stack");
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack.pop());
        }
    }
}
