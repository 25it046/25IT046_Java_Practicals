public class MediaDriver{
    public static void main(String[] args){
        Media[] m={
           new Movie("Avengers",3),
           new Book("Java Book",4),
           new Game("FIFA",2)
        };
        double total=0;
        for(Media x:m){
            double fee=x.lateFee();
            System.out.println(x.name+" Late Fee: "+fee);
            total=total+fee;
        }
        System.out.println("Total Late Fee: "+total);
    }
}
