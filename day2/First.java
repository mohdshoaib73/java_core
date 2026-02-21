public class First {
    public static void main(String[] args)
    {
        //Integers--> byte,short,int,long
        //byte a=5;
        //binary representation of 5 is 00000101
       // byte a=0b101;//it is 5 in decimal
       //byte a=010;// it is 10 in octal but it is 8 in decimal
        byte a=0xC;// it is C in hexadecimal but it is 12 in decimal
        short b=55;
        int c=10000;
        long d=54515456;

        System.out.println("values-->"+","+a+ ","+b+","+c+","+d);

        System.out.println();

        //Real numbers-->float,double
        float f=5.614f;
        double e=5.9999;

        System.out.println("Floating number-->"+f+","+e);

        //characters-->char

        char ch='d';
        System.out.println();
        System.out.println("Charcters is -->"+ch);

        //boolean--> boolean

        boolean bl=true;
        System.out.println();
        System.out.println("bool value is -->"+bl);
    }
}
