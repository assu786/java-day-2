class A 
{
    public static void main(String args[])
    {
        int a=10,b=20;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swapping a="+a +",b="+b);
    }
}