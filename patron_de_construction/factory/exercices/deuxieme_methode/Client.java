package patron_de_construction.factory.exercices.deuxieme_methode;

import java.util.Scanner;

public class Client {
    
    public static void main(String[] args) {
        int choix;
       ProduitFactory produitFactory1 = new ProduitFactory1();
       ProduitFactory produitFactory2 = new ProduitFactory2();
       ProduitFactory produitFactory3 = new ProduitFactory3();
       ProduitA produitA = null;
       
       System.out.println("***entrez le type de produit que vous souhaitez fabriquer en utilisant la deuxieme methode:***");
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
                   produitA = produitFactory1.getProduitA();
                   produitA.methodeA();
                   System.out.println("\n");
                   break;
               
               case 2:
                   produitA = produitFactory2.getProduitA();
                   produitA.methodeA();
                   System.out.println("\n");
                   break;
                   
               case 3:
                   produitA = produitFactory3.getProduitA();
                   produitA.methodeA();
                   System.out.println("\n");
                   break;
                  
               
           }
       
           
       System.out.println("***entrez le type de produit que vous souhaitez fabriquer en utilisant la deuxieme méthode:***");
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
