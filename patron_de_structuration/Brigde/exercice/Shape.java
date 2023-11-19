package patron_de_structuration.Brigde.exercice;



public abstract class Shape {
    Color color;
    Shape(Color color)
    {
    this.color=color;
    }
    abstract public void colorIt();
}