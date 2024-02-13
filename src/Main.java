public class Main {
    public static void main(String[] args) {

        int a = 6, b = 4 ;
        a = ++a + b++ + a++;
        int c = --a + b--;
        System.out.println(a + " --- " + b + " --- " + c);

        String world1 = "Привет ";
        String world2 = "Мир!";
        String phrase = world1 + world2;
        System.out.println(phrase);


        System.out.println("Hello world!");

        {
            int g = 45;
            System.out.println(g);
        }
        int s = 7;
        int f = 9;
        if (s < f) {
            System.out.println("folse");
        } else {
            System.out.println("true");
        }
    }
}