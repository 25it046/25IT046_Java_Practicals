public class ParkingLot
{
  private int two=0;
  private int four=0;
  private final int twoCap=2;
  private final int fourCap=2;
  private static long money=0;
  void park(String type)
  {
    if(type.equals("two"))
    {
       if(two<twoCap)
       {
          two++;
          money+=20;
          System.out.println("Two Wheeler Parked");
       }
       else
       {
          System.out.println("Full");
       }
    }
    else if(type.equals("four"))
    {
       if(four<fourCap)
       {
          four++;
          money+=40;
          System.out.println("Four Wheeler Parked");
       }
       else
       {
          System.out.println("Full");
       }
    }
  }
  void leave(String type)
  {
    if(type.equals("two")&&two>0)
    {
       two--;
    }
    else if(type.equals("four")&&four>0)
    {
       four--;
    }
  }
  public static void main(String[] args)
  {
    ParkingLot p=new ParkingLot();
    p.park("two");
    p.park("two");
    p.park("two");
    p.park("four");
    p.park("four");
    p.park("four");
    p.leave("two");
    p.leave("four");
    System.out.println("Two Wheelers: "+p.two);
    System.out.println("Four Wheelers: "+p.four);
    System.out.println("Revenue: "+money);
  }
}
