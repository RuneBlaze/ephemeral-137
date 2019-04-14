class ChainsOfNirvanaE {
    static int x;
    public static void main(String[] args) {
        ChainsOfNirvanaE r1 = c();
        ChainsOfNirvanaE r2 = r1.c();
        ChainsOfNirvanaE r3 = r2.c();
        ChainsOfNirvanaE r4 = r3.c();
    }

    static ChainsOfNirvanaE c() {
        x = x + 1;
        System.out.println(x);
        return new ChainsOfNirvanaE();
    }
}