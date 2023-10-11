package patron_de_construction.factory.cours.premiere_methode;

public class Client {
    
    public static void main(String[] args) {
        
        ProduitFactory produitFactory = new ProduitFactory();
        ProduitA produitA = null;
        
        System.out.println("\n");
        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUIT);
        produitA.methodeA();
        System.out.println("\n");
     }
}
