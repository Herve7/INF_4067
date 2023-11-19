package patron_de_structuration.Brigde.exercice;

public class BridgeDesignPatternMain {
    


    public static void main(String[] args) {
        Shape s1=new Rectangle(new RedColor());
        s1.colorIt();
        Shape s2=new Circle(new BlueColor());
        s2.colorIt();
        Shape s3 = new square(new GreenColor());
        s3.colorIt();
        }
}
