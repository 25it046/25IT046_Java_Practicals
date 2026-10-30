public class PasswordCheckerDriver{
    public static void main(String[] args){
        PasswordChecker p=new PasswordChecker();
        String[] pw={
           "abc",
           "Hello12",
           "Abcd1234!"
        };
        for(String s:pw){
            System.out.println("Password: "+s);
            System.out.println("Length: "+p.length(s));
            System.out.println("Uppercase: "+p.upper(s));
            System.out.println("Digit: "+p.digit(s));
            System.out.println("Special: "+p.special(s));
            System.out.println("Strength: "+p.strength(s));
            System.out.println();
        }
    }
}
