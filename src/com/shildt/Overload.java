package com.shildt;

class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    //Перегружаемый метод, проверяющий наличие одного целочисленного параметра
    void test(int a) {
        System.out.println("a: " + a);
    }

    //Перегружаемый метод, проверяющий наличие двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    //Перегружаемый метод, проверяющий наличие параметра типа double
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

class Overload {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result: " + result);
    }
}

class OverloadDemo2 {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    //Перегружаемый метод, проверяющий наличие двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    //Перегружаемый метод, проверяющий наличие параметра типа double
    void test(double a) {
        System.out.println("Внутреннее преобразование при вызове : " + " test(double) a: " + a);
    }
}

class Overload2 {
    public static void main(String args[]) {
        OverloadDemo2 ob = new OverloadDemo2();
        int i = 88;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        ob.test(i);
        ob.test(123.2);
    }
}

class OverloadCons {
    public static void main(String args[]) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        vol = mybox1.volume();
        System.out.println("mybox1 = " + vol);

        vol = mybox2.volume();
        System.out.println("mybox2 = " + vol);

        vol = mycube.volume();
        System.out.println("mycube = " + vol);
    }
}