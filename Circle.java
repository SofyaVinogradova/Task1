public class Circle {
    double radius;
    public Circle(double radius){
        if (radius==0){
            throw new RuntimeException("A circle with such parameters does not exist.");
        }
        this.radius=radius;
    }
    public double findSquare(){
        return Math.PI*radius*radius;
    }
    public double findPerimetr() {
        return 2 * Math.PI * radius;
    }

}
