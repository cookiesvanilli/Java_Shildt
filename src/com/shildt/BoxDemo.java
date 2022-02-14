package com.shildt;

class Box {
    double width;
    double height;
    double depth;

    // вывести объём параллелепипеда
  /*  void volume() {
        System.out.print("Oбъём равен ");
        System.out.println(width * height * depth);

    }*/
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

/*class BoxDemo {
    public static void main(String args[]) {
        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        //объём параллепипида
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объём равен " + vol);
    }
}*/

/*class BoxDemo2 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 12;
        mybox1.height = 32;
        mybox1.depth = 13;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объём равен " + vol);

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объём равен " + vol);
    }

}*/

/*class BoxDemo3 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 12;
        mybox1.height = 32;
        mybox1.depth = 13;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        mybox1.volume();
        mybox2.volume();
    }
}*/

class BoxDemo4 {
    public static void main(String args[]) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        double vol;

        vol = mybox1.volume();
        System.out.println("Объём равен " + vol);

        vol = mybox2.volume();
        System.out.println("Объём равен " + vol);
    }

}