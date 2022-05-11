package com.shildt.inheritance;

public class RefDemo {
    public static void main(String args[]) {
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("V weightbox = " + vol);
        System.out.println("Weight weightbox = " + weightbox.weight);
        System.out.println();

        //присвоить переменной ссылки на объект типа BoxWeight
        //ссылку на объект типа Box
        plainbox = weightbox;
        vol = plainbox.volume(); //Верно, т.к. метод volume() определен в классе Box
        System.out.println("V plainbox = " + vol);

        /*Следующий оператор ошибочен, т.к. член plainbox не определяет член weight*/
        //System.out.println("Weight plainbox = " + plainbox.weight);
    }
}
