class   calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }
    public int add(int a , int b, int c)
    {
        return a + b + c;
    }
}

public class methodoverloading
{
    public static void main(String[] args)
    {
        calculator c = new calculator();
        int r1 = c.add(10, 20);
        System.out.println(r1);
    }
 }