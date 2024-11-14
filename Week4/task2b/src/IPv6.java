package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IPv6 {
    private static final String IPv6_PATTERN = "^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";

    public static boolean isIPv6Adress(String ipAdress) {
        if (ipAdress == null) {
            return false;
        }
        Pattern pattern =Pattern.compile(IPv6_PATTERN);
        Matcher matcher = pattern.matcher(ipAdress);
        return matcher.matches();
    }

}
