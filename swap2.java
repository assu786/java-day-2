import java.util.*;
class Demo
{
    public static void main(String args[])
    {
        Scanner n=new Scanner (System.in);
        int b=n.nextInt();
        int g=n.nextInt();
        int c=b;
        b=g;
        g=c;
        String res=String.format("after swapping\nboy=%d\ngirl=%d",b,g);
        System.out.println(res);
    }
}