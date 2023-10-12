package patron_de_construction.builder.exercice;

public class MonteurPizzaLocale extends MonteurPizza{
    
    protected Pizza pizza;

    public Pizza getPizza(){

        return pizza;
    }

    public void creerNouvellePizza(){

        pizza = new Pizza();
    }

    @Override
    public void monterPate() {
        
        pizza.setPate("feuille de macabo");
    }

    @Override
    public void monterSauce() {
        
        pizza.setSauce("sauce jaune");
    }

    @Override
    public void monterGarniture() {
        
        pizza.setGarniture("escargot");
    }
    
}
