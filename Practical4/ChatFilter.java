public class ChatFilter{
    String check(String msg,String key){
        if(msg.toLowerCase().contains(key.toLowerCase()))
           return "yes";
        return "no";
    }
}
