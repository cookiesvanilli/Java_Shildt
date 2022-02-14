package com.shildt;

public class Stack {
    //целочисленный стек, где хранится до 10 значений
    int stck[] = new int[10];
    int tos;

    //инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    //разместить элемент в стеке
    void push(int item) {
        if (tos == 9) {
            System.out.println("Стек заполнен.");
        } else {
            stck[++tos] = item;
        }
    }

    //извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

class TestStack {
    public static void main(String args[]) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //разместить числа в стеке
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        //извлечь эти числа из стека
        System.out.println("mystack1: ");
        for (int i = 0; i < 10; i++) System.out.println(mystack1.pop());

        System.out.println("mystack2: ");
        for (int i = 0; i < 10; i++) System.out.println(mystack2.pop());
    }
}
