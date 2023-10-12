package patron_de_construction.builder.cours;

public abstract class MonteurPizza {
    
    protected Pizza pizza;

    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();

    public Pizza getPizza(){

        return pizza;
    }

    public void creerNouvellePizza(){

        pizza = new Pizza();
    }
}
