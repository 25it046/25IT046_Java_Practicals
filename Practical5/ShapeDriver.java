public class ShapeDriver{
    public static void main(String[] args){
        Shape[] s={
           new Circle(2),
           new Rectangle(4,5),
           new Triangle(6,4)
        };
        double total=0;
        double max=0;
        for(Shape x:s){
            double a=x.area();
            System.out.println("Area: "+a);
            total=total+a;
            if(a>max)
               max=a;
        }
        System.out.println("Total: "+total);
        System.out.println("Largest: "+max);
    }
}
