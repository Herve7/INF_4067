package patron_de_construction.abstract_factory.cours;

public class ProduitFactory2 implements FabriqueAbstraite{

    @Override
    public ProduitA getProduitA() {
        
        return new ProduitA2();
    }

    @Override
    public ProduitB getProduitB() {
        
        return new ProduitB2();
    }
    
}
