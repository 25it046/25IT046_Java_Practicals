abstract class Media{
     String name;
     int days;
     Media(String name,int days){
        this.name=name;
        this.days=days;
    }
    abstract double lateFee();
}
class Movie extends Media{
    Movie(String name,int days){
      super(name,days);
    }
    double lateFee(){
      return days*10;
    }
}
class Book extends Media{
    Book(String name,int days){
      super(name,days);
    }
    double lateFee(){
      return days*5;
    }
}
class Game extends Media{
    Game(String name,int days){
      super(name,days);
    }
    double lateFee(){
      return days*15;
    }
}
