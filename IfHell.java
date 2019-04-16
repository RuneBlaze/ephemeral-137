class IfHell {
    public static void main(String[] args) {
        int x = 0;
        if (x < 0) {
            int y = 0;
        } else {
            int z = -10;
            z = z + 42;
            System.out.println(z);
        }
    }
}