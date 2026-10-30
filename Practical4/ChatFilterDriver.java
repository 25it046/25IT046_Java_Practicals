import java.util.Scanner;
public class ChatFilterDriver{
    public static void main(String[] args){
        String[] log={
           "10:05 alice Hello there",
           "10:10 bob Good morning",
           "wrongline"
        };
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter keyword: ");
        String key=sc.nextLine();
        ChatFilter c=new ChatFilter();
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(String s:log){
          String[] p=s.split(" ",3);
          if(p.length<3)
             continue;
          if(c.check(p[2],key).equals("yes")){
             count++;
             sb.append(p[0]+" "+p[1]+": "+p[2]+"\n");
             }
         }
         System.out.println("Matches: "+count);
         System.out.println(sb);
     }
}
