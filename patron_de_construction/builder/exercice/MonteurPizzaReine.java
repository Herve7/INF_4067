package patron_de_construction.builder.exercice;

public class MonteurPizzaReine extends MonteurPizza{

    protected Pizza pizza;

    public Pizza getPizza(){

        return pizza;
    }

    public void creerNouvellePizza(){

        pizza = new Pizza();
    }
    

    @Override
    public void monterPate() {
        
        pizza.setPate("croisée");
    }

    @Override
    public void monterSauce() {
       
        pizza.setSauce("douce");
    }

    @Override
    public void monterGarniture() {
       
        pizza.setGarniture("jambon+champignon");
    }
    
}
