package Primefinder;

public class PrimeTester {
    public static void main(String args[]){
        PrimeFinder p = new PrimeFinder(1000000);
        System.out.println(p.prime(999998));
        System.out.println(p.prime(999999));
        System.out.println(p.prime(999));
    }
}
