class ANestedSenseOfHumor {
    static int start;
    public static void main(String[] args) {
        start = 42;
        ANestedSenseOfHumor h = new ANestedSenseOfHumor();
        System.out.println(h.run(start));   
    }

    public int run(int s) {
        if (s < 0) {
            int y = 0;
            int z = 1;
            System.out.println(-182 + y + z + s);
            return 999;
        } else if (s >= 0) {
            int y = 42;
            int z = 420;
            int p = ackermann(3, 2);
            z = p;
            p = y;
            y = z;
            System.out.println(p);
            System.out.println(s);
            ANestedSenseOfHumor h = new ANestedSenseOfHumor();
            return h.run(s - y / 10 + z / 20);
        }
        return 0;
    }

    int ackermann(int m, int n) {
        if (false) {
            int foo = 100;
        } else {
            int bar = -42;
        }
        if (m == 0) return n + 1;
        if (n == 0) return this.ackermann(m - 1, 1);
        int z = 999 + start;
        return ackermann(m - 1, ackermann(m, n - 1));
    }
}