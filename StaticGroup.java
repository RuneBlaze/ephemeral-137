class StaticGroup {
    static int blah;
    static int fun() {
        blah = 99;
        return 1;
    }

    int foo() {
        return blah;
    }

    public static void main(String[] args) {
        StaticGroup s = new StaticGroup();
        System.out.println(s.fun() + s.foo());
    }
}