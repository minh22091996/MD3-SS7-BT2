package rikkei.academy;

public class Main {

    public static void main(String[] args) {
	 Shape[] arr = {new Rectangle(8,9,"green",false), new Square(6)
     ,new Circle(5),new Shape() {

         @Override
         public double getArea() {
             return 0;
         }
     }} ;

        for (Shape shape: arr) {
            System.out.println(shape.getArea());
            if(shape instanceof  Colorable){
                ((Colorable) shape).howToColor();
            }
        }
    }
}
