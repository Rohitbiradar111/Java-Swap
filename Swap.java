public class Swap
{
    public static void main(String args[])
    {
        int a = 5;
        int b = 10;
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a+" , b = "+b);
    }
}