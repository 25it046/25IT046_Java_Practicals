import java.util.Objects;
public class Fraction
{
  private int num;
  private int den;
  Fraction(int num,int den)
  {
    int a=num;
    int b=den;
     while(b!=0)
     {
       int t=b;
       b=a%b;
       a=t;
     }
     this.num=num/a;
     this.den=den/a;
    }
    public String toString()
    {
      return num+"/"+den;
    }
    public boolean equals(Object obj)
    {
      if(this==obj)
      {
          return true;
      }
      if(!(obj instanceof Fraction))
      {
          return false;
      }
      Fraction f=(Fraction)obj;
      return num==f.num&&den==f.den;
    }
    public int hashCode()
    {
      return Objects.hash(num,den);
    }
}
