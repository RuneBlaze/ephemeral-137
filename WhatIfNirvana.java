class WhatIfNirvana {
    public static void main(String[] args) {
        boolean x = false;
        if (x) {
            int z = 0;
            int blah = 10;
            int foo = 1000;
            x = !x;
        } else {
            int y = 42;
            x = !x;
            if (x) {
                System.out.println(y);
                x = !x;
                if (x) {
                    int kkk = 0;   
                } else {
                    System.out.println(99199);
                }
            } else {
                int p = -1;
            }
        }
        int n = 9999;
        System.out.println(n);
    }
}