public class Circle {
    double radius;
    public Circle(double radius){
        if (radius==0){
            throw new RuntimeException("There is no figure with such parameters.");
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
