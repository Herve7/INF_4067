package patron_de_construction.factory.cours.deuxieme_methode;

public class Client {
    
    public static void main(String[] args) {
        
        ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitA produitA = null;
        
        System.out.println("\n");
        produitA = produitFactory1.getProduitA();
        produitA.methodeA();
        System.out.println("\n");
        
     }
}
