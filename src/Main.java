import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a , b ,c ,u, alan ;
        Scanner uzunluk = new Scanner(System.in);

        System.out.print("a kenar uzunluğu : ");
        a = uzunluk.nextDouble();

        System.out.print("b kenar uzunluğu : ");
        b = uzunluk.nextDouble();

        System.out.print("c kenarı uzunluğu : ");
        c = uzunluk.nextDouble();

        u = (a+b+c)/2 ;

        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.print(" alan hesabı :"  + alan ) ;


    }
}
