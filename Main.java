package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String x = "java";
        x.concat(" jest fajna");
        String y = x.concat(" jest fajna");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("--------------------------");
        String x1 = "java";
        String x2 = " jest fajna";
        String x3 = x1.concat(x2);
        System.out.println(x3);
        System.out.println("--------------------------");
        System.out.println(x1 + x2);
        System.out.println("--------------------------");
        System.out.println("x = " + x.concat(" jest fajna"));
        System.out.println("--------------------------");
        String x4 = "Ala";
        int a = 2;
        int b = 6;
        System.out.println("#" + x4 + ", wynik mnożenia a*b=" + a*b);
        System.out.println("--------------------------");
        Auto auto4 = new Auto("Mercedes","czerwony",170,2005);
        System.out.println("#" + x4 + " " + auto4);
        
//-----------------------------------------------------------------------------
//        Auto auto = new Auto("Mercedes","czerwony",170,2005);
//        Auto auto1 = new Auto("Citroen","szary",200,2012);
//        Auto auto2 = new Auto("Mercedes","czerwony",170,2005);
//        Auto auto3 = new Auto("czarny",130,1999);
//        System.out.println(auto.equals(auto1)); //sprawdzenie czy są równe po wygenerowaniu equals w klasie auto
//        System.out.println(auto.equals(auto2));
//        System.out.println(auto.getClass()); //sprawdzenie nazwy pakietu i klasy dla "auto" po wygenerowaniu equals w klasie auto
//
//        System.out.println(auto);
//        System.out.println(auto1);
//        System.out.println(auto2);
//        System.out.println(auto3);
// -------------------------------------------------------------------------
//        OverloadingExample overloadingExample = new OverloadingExample();
//        OverloadingExample overloadingExample1 = new OverloadingExample();
//
//        System.out.println("Wynik dodawania: " + overloadingExample.add(4,6));
//        System.out.println("Wynik dodawania: " + overloadingExample1.add(10,10,10,10));
// -----------------------------------------------------------------------
//        DocumentItem wordItem = new WordDocument();
//        DocumentItem excelItem = new ExcelDocument();
//        DocumentItem pdfItem = new PdfDocument();
//
//        System.out.println(wordItem.getDescription());
//        System.out.println(excelItem.getDescription());
//        System.out.println(pdfItem.getDescription());
// ---------------------------------------------------------------------
//        String s1 = new String("cześć");
//        String s2 = new String("cześć");
//        String s3 = new String("Hej");
//
//        if (s1 == s2) { //"==" Sprawdza miejsce zapisu
//            System.out.println("s1==s2 is TRUE");
//        } else {
//            System.out.println("s1==s2 is FALSE");
//        }
//        if(s1.equals(s2)) { //"equals" Sprawdza czy wartość obiektów jest taka sama
//            System.out.println("s1.equals(s2) is TRUE");
//        } else {
//            System.out.println("s1.equals(s2) is FALSE");
//        }
//        if(s1.equals(s3)) {
//            System.out.println("s1.equals(s3) is TRUE");
//        } else {
//            System.out.println("s1.equals(s3) is FALSE");
//        }
 // ------------------------------------------------------------------------




    }
}
