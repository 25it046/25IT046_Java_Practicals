public class PasswordChecker
{
  boolean length(String pw)
  {
    return pw.length()>=8;
  }
  boolean upper(String pw)
  {
    return pw.matches(".*[A-Z].*");
  }
  boolean digit(String pw)
  {
    return pw.matches(".*[0-9].*");
  }
  boolean special(String pw)
  {
    return pw.matches(".*[^a-zA-Z0-9].*");
  }
  String strength(String pw)
  {
    int count=0;
    if(length(pw))
    {
        count++;
    }
    if(upper(pw))
    {
        count++;
    }
    if(digit(pw))
    {
        count++;
    }
    if(special(pw))
    {
            count++;
        }
        if(count<=1)
        {
           return "Weak";
        }
        else if(count<=3)
        {
           return "Medium";
        }
        else
        {
           return "Strong";
        }
    }
}
