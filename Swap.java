//This program Swaps two values

public class Swap
{
    public static void main(String args[])
    {
        //initializing three variables
        int a = 5;
        int b = 10;
        int temp = 0;

        //swaping the values
        temp = a;
        a = b;
        b = temp;

        //printing the swapped values
        System.out.println("a = "+a+" , b = "+b);
    }
}