class MoreThan4{
    public static void main(String[] a){
        MT4 m = new MT4();
        System.out.println(m.Start(1,2,3,4,5,6));
    }
}

class MT4 {
    public int Start(int p1, int p2, int p3 , int p4, int p5, int p6){
	int aux = 0;
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
	aux = this.Change(p6,p5,p4,p3,p2,p1);
	return aux ;
    }

    public int Change(int p1, int p2, int p3 , int p4, int p5, int p6){
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
	return 0 ;
    }
}