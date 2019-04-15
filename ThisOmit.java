class ThisOmit {
    int i;
    public static void main(String[] args) {
        ThisOmit me = new ThisOmit();
        me = new ThisOmit();
        me.run();
    }

    void run() {
        if (this.i == i) {
            System.out.println(this.i);
        }
        i = i + 1;
        if (this.i == i) {
            System.out.println(i);
        }
        this.i = this.i + 1;
        if (this.i == i) {
            System.out.println(i);
        }
        this.i = i + 1;
        if (this.i * 2 == i * 2) {
            System.out.println(i);
        }
    }
}