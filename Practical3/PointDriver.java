public class PointDriver
{
  public static void main(String[] args)
  {
    Point[] p={
       new Point(1,2),
       new Point(2,3),
       new Point(1,2),
       new Point(4,5),
       new Point(2,3)
    };
    int count=0;
    for(int i=0;i<p.length;i++)
    {
       boolean found=false;
       for(int j=0;j<i;j++)
       {
           if(p[i].equals(p[j]))
           {
              found=true;
              break;
           }
       }
       if(!found)
       {
           count++;
       }
    }
    System.out.println("Distinct: "+count);
  }
}
