public class Rectangle {
    double a,b; //a - длина прямоугольника, b - ширина прямоугольника
    public Rectangle(double a, double b){
        if ((a==0)||(b==0)){
            throw new RuntimeException("A rectangle with such parameters does not exist.");
        }
        this.a=a;
        this.b=b;
    }
    public double findSquare(){
        return a*b;
    }
    public double findPerimetr(){
        return 2*(a+b);
    }
}