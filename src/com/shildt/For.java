package com.shildt;

public class For {
    public void a() {
        String[] list = new String[]{
                "1", "2", "3", "4", "5"
        };
        for (String x : list) {
            System.out.println(x);
        }
    }
}

class ForClass {
    public static void main(String[] args) {
        For f = new For();
        f.a();
    }
}