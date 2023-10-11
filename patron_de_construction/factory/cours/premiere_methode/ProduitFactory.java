package patron_de_construction.factory.cours.premiere_methode;

public class ProduitFactory {
    
    public static final int TYPE_PRODUIT = 1;
    
    public ProduitA getProduitA(int typeProduit){
        
        ProduitA produitA = null;
    
       
                produitA = new ProduitA1();
               return produitA;
        }
}
