package com.shildt.inheritance;

//Переопределение методов служит основной для реализации в Джава одного из самых эффективных принципов -
//динамической диспетчеризации методов. Динамическая диспетчеризация методов - это механизм, с помощью которого вызов переопределенного метода разрешается во время выполнения,
//а не компиляции. Динамическая диспетчеризация методов важно потому, что благодаря ей полиморфизм в Джава реализуется во время выполнения.

//Динамическая диспетчеризация методов
class A3 {
    void callme() {
        System.out.println("In method callme() from class A");
    }
}

class B3 extends A3 {
    //переопределить метод callme()
    void callme() {
        System.out.println("In method callme() from class B");
    }
}

class C3 extends A3 {
    //переопределить метод callme()
    void callme() {
        System.out.println("In method callme() from class C");
    }
}

class Dispatch {
    public static void main(String[] args) {
        A3 a = new A3(); // объект класса A;
        B3 b = new B3(); // объект класса B;
        C3 c = new C3(); // объект класса C;

        A3 r; // получить ссылку на объект типа А

        r = a;// переменная r ссылается на объект типа A
        r.callme(); //вызвать метод callme(), определенный в классе А

        r = b; // переменная r ссылается на объект типа B
        r.callme(); //вызвать метод callme(), определенный в классе B

        r = c; // переменная r ссылается на объект типа C
        r.callme(); //вызвать метод callme(), определенный в классе C

    }
}
