package patron_de_construction.factory.cours.premiere_methode;

public class ProduitFactory {
    
    public static final int TYPE_PRODUIT1 = 1;
    public static final int TYPE_PRODUIT2 = 2;
    
    public ProduitA getProduitA(int typeProduit){
        
        ProduitA produitA = null;
    
            switch(typeProduit){
                case TYPE_PRODUIT1:
                    produitA = new ProduitA1();
                    break;
                case TYPE_PRODUIT2:
                    produitA = new ProduitA2();
                    break;
                default:
                    throw new IllegalArgumentException("Type de produit inconnu");
            }

            return produitA;
        }
}
