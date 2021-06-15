import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final String REGEXEMAIL ="^\\w+@[a-zA-Z]+\\.[a-zA-Z]+$";
    public static final String REGEXPHONENUMBER ="^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";
    public boolean Check(String regex,String str){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
