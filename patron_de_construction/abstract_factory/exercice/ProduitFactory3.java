package patron_de_construction.abstract_factory.exercice;

public class ProduitFactory3 implements FabriqueAbstraite{
    
    @Override
    public ProduitA getProduitA() {
        
        return new ProduitA3();
    }

    @Override
    public ProduitB getProduitB() {
        
        return new ProduitB3();
        
    }
}
