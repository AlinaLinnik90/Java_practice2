package demo;

public class HelloWorld {
    static int StaticDemo;

    public static void main(String[] args) {
        int anArray[] = new int[10];
        anArray[0] = 100;
        anArray[1] = 200;

        int i = 10;
        int n = ++i % 5;

        int test = 10;
        int demo = 5;
        int result = (test + demo) * 30;


        if (test < demo)
            System.out.println("Test1");
        else {
            System.out.println("Test2");
            System.out.println("Test3");
        }
        String test1 = "Hello";
        switch (test1) {
            case "Hello":
                System.out.println("1");
                break;
            case "World":
                System.out.println("2");
                break;
            case "Hi":
                System.out.println("3");
                break;
            default:
                System.out.println("30");
        }
        for (int j = 10; j <= 20; j = j + 2) {
            if (j == 16) break;
            System.out.println(j);
        }
        System.out.println(1000 * 60 * 60 * 21 * 30L);
        System.out.println(1000 * 60 * 60 * 21 * 30);
        System.out.println(1 / 2);
        double x = 1 / 2;
        System.out.println(x);
        double y = 1d / 2;
        System.out.println(y);
        byte f = 10;
        // f=f*10;error
        f = (byte) (f * 10);//yavne privedeniya tupiv
        int $const_goto = 2;
        //Домашє завдання
        double a = 9;
        double b = -30;
        double c = 25;
        boolean b1 = b != 0;
        if (b1) ;
        //check b!=0
        var D = (b * b) - (4 * a * c);
        System.out.println(D);
        if (D < 0)
            System.out.println("Немає рішень");
        else if (D == 0) {
            double z = -b / (2 * a);
            System.out.println(z);
        } else {
            double z1 = (Math.sqrt(D) - b) / (2 * a);
            double z2 = (-(Math.sqrt(D)) - b) / (2 * a);
            System.out.println(z1);
            System.out.println(z2);
        }
    }
}