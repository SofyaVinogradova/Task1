public class Main {
    public static void main(String[] args){
        Circle circle=new Circle(3);
        System.out.println(circle.findSquare());
        Triangle triangle= new Triangle(2,4,5);
        System.out.println(triangle.findPerimetr());
        Rectangle rectangle =new Rectangle(4.5,6.7);
        System.out.println(rectangle.findSquare());
    }
}