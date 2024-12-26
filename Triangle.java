public class Triangle {
        double a,b,c; // a,b,c - три стороны трреугольника
        public Triangle(double a,double b, double c){
            if ((a==0)||(b==0)||(c==0)||(a+b<=c)||(a+c<=b)||(b+c<=a)){
                throw new RuntimeException("A triangle with such parameters does not exist.");
            }
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public double findPerimetr(){
            return a+b+c;
        }
        public double findSquare(){
           double p=findPerimetr()/2;
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }

    }

