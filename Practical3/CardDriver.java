public class CardDriver
{
  public static void main(String[] args)
  {
    Card[] c={
       new Card("Ace","Spades"),
       new Card("King","Hearts"),
       new Card("Queen","Clubs"),
       new Card("Ace","Spades")
    };
    for(int i=0;i<c.length;i++)
    {
       for(int j=0;j<i;j++)
       {
           if(c[i].equals(c[j]))
           {
              System.out.println("Duplicate found: "+c[i]);
              return;
           }
       }
    }
  }
}
