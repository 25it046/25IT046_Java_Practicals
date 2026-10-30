public class CinemaShow
{
  private String title;
  private int seats;
  private final int capacity;
  private static int total=0;
  CinemaShow(String title,int capacity)
  {
    this.title=title;
    this.capacity=capacity;
    seats=capacity;
  }
  CinemaShow(String title)
  {
    this(title,100);
  }
  boolean book(int n)
  {
    if(n<=seats)
    {
       seats-=n;
       total+=n;
       return true;
    }
    return false;
  }
  void cancel(int n)
  {
    seats+=n;
    if(seats>capacity)
    {
       seats=capacity;
    }
  }
  int getSeats()
  {
    return seats;
  }
  static int getTotal()
  {
    return total;
  }
  public static void main(String[] args)
  {
    CinemaShow c1=new CinemaShow("Movie");
    System.out.println(c1.book(30));
    System.out.println("Seats: "+c1.getSeats());
    System.out.println(c1.book(50));
    System.out.println("Seats: "+c1.getSeats());
    System.out.println(c1.book(30));
    System.out.println("Seats: "+c1.getSeats());
    c1.cancel(20);
    System.out.println("Seats: "+c1.getSeats());
    System.out.println("Total Booked: "+getTotal());
  }
}
