class ShortCircuit {
    public static void main(String[] args){
        System.out.println(cast(True() && True()));
        System.out.println(cast(False() && False()));
        System.out.println(cast(True() && False()));
        System.out.println(cast(False() && True()));
        System.out.println(cast(True() || True()));
        System.out.println(cast(False() || False()));
        System.out.println(cast(True() || False()));
        System.out.println(cast(False() || True()));
    }

    static int cast(boolean t) {
        if (t) return 1;
        return 0;
    }

    static boolean True() {
        System.out.println(42);
        return true;
    }

    static boolean False() {
        System.out.println(-42);
        return false;
    }
}