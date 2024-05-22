public class Example5_1 {
    public static void main (String[] args)
    {
        double radians = 30.0;
        double d1 = 2.0, d2 = 8.0;
        int num, x = 15, y = 25;
        double degree = 45;
        double p = -3.14;

        System.out.println("cos(" + radians + ")= " + Math.cos(radians));
        System.out.println("pow(" + d1 + "," + d2 + ")= " + Math.pow(d1, d2));
        System.out.println("max(" + x + "," + y + ")= " + Math.max(x, y));
        System.out.println("min(" + d1 + "," + d2 + ")= " + Math.min(d1, d2));
        System.out.println("sqrt(" + y + ")= " + Math.sqrt(y));
        System.out.println("round(" + d2 + ")= " + Math.round(d2));
        System.out.println("ceil(" + p + ")= " + Math.ceil(p));
        System.out.println("floor(" + p + ")= " + Math.floor(p));
        System.out.println("toRadians(" + degree + ")= " + Math.toRadians(degree));
        System.out.println("exp(" + d1 + ")= " + Math.exp(d1));
        
        System.out.println("Generate 5 integer random numbers less than or equal to 5:");
        for (int i = 1; i <= 5; i++)
        {
            num = (int) (6 * Math.random());
            System.out.print("num" + i + "=" + num + "\t");
        }
    }
}
