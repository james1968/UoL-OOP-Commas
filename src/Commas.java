import java.io.*;
import java.util.*;

public class Commas {

    public static String separate( String s )
    {
        List<String> list = Arrays.asList(Arrays.toString(s.toCharArray()));
        String result = String.join(",", list);
        String str = result.substring(1, result.length() - 1);
        String str2 = str.replaceAll("\\s", "");
        return str2;

    }
}
