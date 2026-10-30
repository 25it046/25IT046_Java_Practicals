public class Thermostat
{
     private String l;
     private int t;
     private static final int MIN=16;
     private static final int MAX=30;
     private static int c=0;
     Thermostat(String l,int s)
     {
       this.l=l;
       if(s>=MIN && s<=MAX)
       {
          t=s;
       }
       else
       {
          t=22;
       }
       c++;
     }
     Thermostat(String l)
     {
       this(l,22);
     }
     void raise()
     {
       if(t<MAX)
       {
          t++;
       }
       else
       {
          System.out.println("Already at maximum (30)");
       }
     }
     void lower()
     {
         if(t>MIN)
         {
            t--;
         }
         else
         {
            System.out.println("Already at minimum (16)");
         }
     }
     int getTemperature()
     {
       return t;
     }
     static int getActiveCount()
     {
       return c;
     }
     public static void main(String[] args)
     {
       Thermostat t1=new Thermostat("Hall",22);
       Thermostat t2=new Thermostat("Room");
       for(int i=1;i<=10;i++)
       {
         t1.raise();
         System.out.println(t1.getTemperature());
       }
       for(int i=1;i<=20;i++)
       {
         t1.lower();
         System.out.println(t1.getTemperature());
       }
       System.out.println("Active Thermostats: "+getActiveCount());
     }
}
