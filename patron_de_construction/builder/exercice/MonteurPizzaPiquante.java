package patron_de_construction.builder.exercice;

public class MonteurPizzaPiquante extends MonteurPizza{

    protected Pizza pizza;

    public Pizza getPizza(){

        return pizza;
    }

    public void creerNouvellePizza(){

        pizza = new Pizza();
    }
    

    @Override
    public void monterPate() {
        pizza.setPate("feuilletée");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("piquante");
    }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("pepperoni+salami");
    }

    
}
