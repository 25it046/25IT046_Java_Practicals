abstract class Shape{
  abstract double area();
}
class Circle extends Shape{
     double r;
     Circle(double r){
       this.r=r;
     }
     double area(){
       return 3.14*r*r;
     }
}
class Rectangle extends Shape{
     double l,w;
     Rectangle(double l,double w){
       this.l=l;
       this.w=w;
     }
     double area(){
       return l*w;
     }
}
class Triangle extends Shape{
    double b,h;
    Triangle(double b,double h){
      this.b=b;
      this.h=h;
    }
    double area(){
      return 0.5*b*h;
    }
}
