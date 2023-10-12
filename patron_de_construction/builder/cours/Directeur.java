package patron_de_construction.builder.cours;

public class Directeur {

    
    

    public Pizza construirePizza(MonteurPizza monteur){

        monteur.creerNouvellePizza();
        monteur.monterPate();
        monteur.monterSauce();
        monteur.monterGarniture();

        return monteur.getPizza();
    }


    
    
}
