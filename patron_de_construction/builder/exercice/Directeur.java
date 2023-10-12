package patron_de_construction.builder.exercice;

public class Directeur {

    
    

    public Pizza construirePizzaReine(MonteurPizzaReine monteurPizzaReine){

        monteurPizzaReine.creerNouvellePizza();
        monteurPizzaReine.monterPate();
        monteurPizzaReine.monterSauce();
        monteurPizzaReine.monterGarniture();

        return monteurPizzaReine.getPizza();
    }

    public Pizza construirePizzaPiquante(MonteurPizzaPiquante monteurPizzaPiquante){

        monteurPizzaPiquante.creerNouvellePizza();
        monteurPizzaPiquante.monterPate();
        monteurPizzaPiquante.monterSauce();
        monteurPizzaPiquante.monterGarniture();

        return monteurPizzaPiquante.getPizza();
    }

    public Pizza construirePizzaLocale(MonteurPizzaLocale monteurPizzaLocale){

        monteurPizzaLocale.creerNouvellePizza();
        monteurPizzaLocale.monterPate();
        monteurPizzaLocale.monterSauce();
        monteurPizzaLocale.monterGarniture();

        return monteurPizzaLocale.getPizza();
        
    }
    
    
}
