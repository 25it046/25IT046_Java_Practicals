import java.util.regex.*;
public class TemplateFiller{
    String fill(String temp,String[] name,String[] value){
        Pattern p=Pattern.compile("\\{(\\w+)\\}");
        Matcher m=p.matcher(temp);
        StringBuilder sb=new StringBuilder();
        int last=0;
        while(m.find()){
            sb.append(temp.substring(last,m.start()));
            String key=m.group(1);
            String ans="[?]";
            for(int i=0;i<name.length;i++){
              if(name[i].equals(key)){
                 ans=value[i];
                 break;
              }
            }
            sb.append(ans);
            last=m.end();
        }
        sb.append(temp.substring(last));
        return sb.toString();
    }
}
