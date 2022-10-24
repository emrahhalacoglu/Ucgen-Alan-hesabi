import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        double birinciKenar,ikinciKenar,ücüncüKenar,alan,cevre,hipotenus,x=2;
        Scanner input=new Scanner(System.in);
        System.out.print("Birinci Kenar Ölcüsü :");
        birinciKenar=input.nextDouble();
        System.out.print("İkinci Kenar Ölcüsü :");
        ikinciKenar=input.nextDouble();
        System.out.print("Ücüncü Kenar Ölcüsü :");
        ücüncüKenar=input.nextDouble();
        if(Math.pow(birinciKenar,x)+Math.pow(ikinciKenar,x)==Math.pow(ücüncüKenar,x)){System.out.println( "Hipotenus :"+ücüncüKenar);} else if(Math.pow(ikinciKenar,x)+Math.pow(ücüncüKenar,x)==Math.pow(birinciKenar,x)){System.out.println( "Hipotenus :"+birinciKenar);} else if (Math.pow(birinciKenar,x)+Math.pow(ücüncüKenar,x)==Math.pow(ikinciKenar,x)){System.out.println( "Hipotenus :"+ikinciKenar);} else{System.out.println("Ücgen Dik Degildir.");};


        cevre=birinciKenar+ikinciKenar+ücüncüKenar;
        alan=(Math.sqrt(cevre/2*((cevre/2-birinciKenar)*(cevre/2-ikinciKenar)*(cevre/2-ücüncüKenar))));
        System.out.println("Ucgenin Alani :"+alan);
        System.out.println("Ucgenin Cevresi :"+cevre);


    }
    
}
