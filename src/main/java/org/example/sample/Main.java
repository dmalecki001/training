package org.example.sample;

public class Main {

    public static void main(String[] args) {

        double b = 1.0D;
        float f = 2.0F;
        long l = 100L;
        short s = 2;
        byte by = 6;
        boolean myBool = true;
        char myChar = '\u0040';
        char myChar2 = 'u';

        Holder holder1 = new Holder();
        Holder holder2 = new Holder();
        Holder holder3 = new Holder();

        holder1.pierwszaWartosc = 50;
        holder1.drugaWartosc = 200;
        holder3 = holder1;
        holder3.drugaWartosc = 500;
        holder3.pierwszaWartosc = 1000;

        int jeden = 5;
        int dwa = 3;
        int suma = jeden % dwa;
        int wartosc = 100;

       // System.out.println(wartosc++);
        for(int i = 0; i < 10; i++){
            System.out.println(i);
            if(i == 8){
                System.out.println("Chuj dupa kurwa cipa");
            } else if (i == 2){
                System.out.println("Jestem numerem dwa");
            } else {
                System.out.println("Cos tam cos tam");
            }
            i++;
        }


    }

}
