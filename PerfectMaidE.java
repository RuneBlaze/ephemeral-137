class PerfectMaidE {
    public static void main(String[] args) {
        int x = 137;
        int y = 42;
        int z = 16;
        z = y;
        y = x;
        x = z;
        System.out.println(x);
        System.out.println(y);
    }
}