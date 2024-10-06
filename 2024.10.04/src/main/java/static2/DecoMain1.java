package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "Hello World";
        DecoUtil1 decoUtil1 = new DecoUtil1();
        System.out.println(decoUtil1.deco(s));

        String deco = DecoUtil2.deco(s);
        System.out.println("deco 변수 만들고 클래스 static 소환 " + deco);


        System.out.println(DecoUtil2.deco("아몰랑1"));
        System.out.println(DecoUtil2.deco("아몰랑2"));
        System.out.println(DecoUtil2.deco("아몰랑3"));


    }
}
