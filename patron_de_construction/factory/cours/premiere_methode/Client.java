package patron_de_construction.factory.cours.premiere_methode;

public class Client {
    
    public static void main(String[] args) {
        
        ProduitFactory produitFactory = new ProduitFactory();
        ProduitA produitA = null;
        
        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUIT);
        produitA.methodeA();
     }
}
