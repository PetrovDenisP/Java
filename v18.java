public class Main
{
    public static void main(String[] args)
    {
        System.out.println("#1");
        int x = 5;
        int y = 3;
        double v = Math.pow(3, x)- 4 * x + ((y - Math.sqrt(x)));
        System.out.println(v);
        v = Math.pow(2, -x) - Math.cos(x) + Math.sin(2*x*y);
        System.out.println(v);

        System.out.println("#2");
        double a = 531.702;
        double b = (a * 1000) % 1000 + (int) a / 1000.0;
        System.out.println(b);

        System.out.println("#3");
        String str = "f";
        if (str.matches("[A-Z]||[a-z]") )
            System.out.println("True");
        else
            System.out.println("False");
        
        System.out.println("#4");
        int X = 2;
        int Y = 2;
        if (X + Y <= 6 && X + Y >= -6)
            System.out.println("True");
        else
            System.out.println("False");
    }
}