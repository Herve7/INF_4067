package patron_de_construction.factory.exercices.premiere_methode;

import java.util.Scanner;

public class Client {
    
     public static void main(String[] args) {
        int choix;
       ProduitFactory produitFactory = new ProduitFactory();
       ProduitA produitA = null;
       
       System.out.println("\n");
       System.out.println("***entrez le type de produit que vous souhaitez fabriquer:***");
       System.out.println("1:       pour le produit de type A1");
       System.out.println("2:       pour le produit de type A2");
       System.out.println("3:       pour le produit de type A3");
       System.out.println("0:  pour Quitter");
       
       System.out.println("\n");
       Scanner sc = new Scanner(System.in);
       System.out.print("Entrez votre choix:");
       choix = sc.nextInt();
       
       while(choix!=0){
           
           switch(choix){
               
               case 1:
                   produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
                   produitA.methodeA();
                   System.out.println("\n");
                   break;
               
               case 2:
                   produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
                   produitA.methodeA();
                   System.out.println("\n");
                   break;
                   
               case 3:
                   produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA3);
                   produitA.methodeA();
                   System.out.println("\n");
                   break;
                  
               
           }
       
           
       System.out.println("***entrez le type de produit que vous souhaitez fabriquer:***");
       System.out.println("1:       pour le produit de type A1");
       System.out.println("2:       pour le produit de type A2");
       System.out.println("3:       pour le produit de type A3");
       System.out.println("0:  pour Quitter");
       System.out.println("\n");
       System.out.print("Entrez votre choix:");
       
       choix = sc.nextInt();

       
       }

       sc.close();
       
    }

    
}
