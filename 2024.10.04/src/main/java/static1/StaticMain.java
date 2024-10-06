package static1;

public class StaticMain {
    public static void main(String[] args) {
        Static st1 = new Static("A");
        System.out.println(" A count = " + Static.count);

        Static st2 = new Static("B");
        System.out.println(st2.name + " count = " + Static.count);

        Static st3 = new Static("C");
        System.out.println(" C count = " + Static.count);

        Static st4 = new Static("D");
        System.out.println(" D count = " + st4.count);


    }
}
