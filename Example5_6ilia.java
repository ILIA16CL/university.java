public class Example5_6
{
    public static void main(String[] args)
    {
        int x, y;
        Integer num1, num2;
        num1 = 5;     
        num2 = 10;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        
        x = num1 * num2;
        y = num2 - num1;
        System.out.println("x = " + x + ", y = " + y);
        
        String s = new String("34");
        x = Integer.parseInt(s);
        
        s = "Result: " + (x + num1) + " and " + num2.toString();
        System.out.println(s);
    }
}
