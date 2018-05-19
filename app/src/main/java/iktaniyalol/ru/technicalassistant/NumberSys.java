package iktaniyalol.ru.technicalassistant;

import iktaniyalol.ru.technicalassistant.interfaces.Numbertosystem;

public class NumberSys {
    public static String DectoSys(String x, int sys) {
        String znak = "";
        String result = x;
        int num = 0;
        String digits = "0123456789-";
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            if (digits.contains(c + "")) {
                num = Integer.parseInt(x);
                if (num < 0) {
                    znak = "-";
                    num = Math.abs(num);
                }
            } else {
                result = "0";
                break;
            }
        }
        switch (sys) {
            case 0:
                result = Integer.toBinaryString(num).toUpperCase();
                break;
            case 1:
                result = Integer.toOctalString(num).toUpperCase();
                break;
            case 3:
                result = Integer.toHexString(num).toUpperCase();
                break;
        }
        return znak + result;
    }

    public static String HextoSys(String x, int sys) {
        String digits = "0123456789ABCDEF-";
        String znak = "";
        String result = x;
        x = x.toUpperCase();
        if (x.charAt(0) == '-') {
            znak = "-";
        }
        int val = 0;
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (digits.contains(c + "")) {
                int d = digits.indexOf(c);
                if (d != 16) {
                    val = 16 * val + d;
                }
            } else {
                result = "0";
                val = 0;
                break;
            }
        }
        switch (sys) {
            case 0:
                result = Integer.toBinaryString(val).toUpperCase();
                break;
            case 1:
                result = Integer.toOctalString(val).toUpperCase();
                break;
            case 2:
                result = Integer.toString(val);
                break;
        }
        return znak + result;
    }
}
