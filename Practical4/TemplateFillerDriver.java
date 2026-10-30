public class TemplateFillerDriver{
    public static void main(String[] args){
        String temp="Dear {name}, order {id} ships {date}.";
        String[] name={"name","id"};
        String[] value={"Riya","A07"};
        TemplateFiller t=new TemplateFiller();
        System.out.println(t.fill(temp,name,value));
    }
}
