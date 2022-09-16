public class Moverloading{

    static int addition(int a, int b)
    {
     return a+b;
    }
    static int addition(int a, int b, int c)
    {
        return a+b+c;
    }
    static double addition(double a, double b,int c)
    {
        return a+b+c;
    }
    puclic static void main(String [] args){
        System.out.println(12.3,13.5,14);
        System.out.println(12,13,14);
        System.out.println(12,14);
    }
}