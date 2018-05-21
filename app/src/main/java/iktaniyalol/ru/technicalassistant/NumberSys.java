package iktaniyalol.ru.technicalassistant;

import iktaniyalol.ru.technicalassistant.interfaces.Numbertosystem;

public class NumberSys {
    public static String DectoSys(String x, int sys) {
        String znak = "";
        String result = "";
        int num = 0;
        String digits = "0123456789";
        int i = 0;
        if (x.charAt(0) == '-') {
            i = 1;
            znak = "-";
        }
        for (; i < x.length(); i++) {
            char c = x.charAt(i);
            if (digits.contains(c + "")) {
                result = result + c;
            } else {
                znak = "";
                result = "0";
                break;
            }
        }
        num = Integer.parseInt(result);
        if (num == 0) {
            znak = "";
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
        String digits = "0123456789ABCDEF";
        String znak = "";
        String result = "";
        x = x.toUpperCase();
        int num = 0;
        int i = 0;
        if (x.charAt(0) == '-') {
            i = 1;
            znak = "-";
        }
        for (; i < x.length(); i++) {
            char c = x.charAt(i);

            if (digits.contains(c + "")) {
                result = result + c;
            } else {
                result = "0";
                znak = "";
                break;
            }
        }
        num = Integer.parseInt(result, 16);
        if (num == 0) {
            znak = "";
        }
        switch (sys) {
            case 0:
                result = Integer.toBinaryString(num).toUpperCase();
                break;
            case 1:
                result = Integer.toOctalString(num).toUpperCase();
                break;
            case 2:
                result = Integer.toString(num);
                break;
        }
        return znak + result;
    }

    public static String OctaltoSys(String x, int sys) {
        String digits = "01234567";
        String znak = "";
        String result = "";
        x = x.toUpperCase();
        int num = 0;
        int i = 0;
        if (x.charAt(0) == '-') {
            i = 1;
            znak = "-";
        }
        for (; i < x.length(); i++) {
            char c = x.charAt(i);

            if (digits.contains(c + "")) {
                result = result + c;
            } else {
                result = "0";
                znak = "";
                break;
            }
        }
        num = Integer.parseInt(result, 8);
        if (num == 0) {
            znak = "";
        }
        switch (sys) {
            case 0:
                result = Integer.toBinaryString(num).toUpperCase();
                break;
            case 2:
                result = Integer.toString(num);
                break;
            case 3:
                result = Integer.toHexString(num).toUpperCase();
                break;
        }
        return znak + result;
    }

    public static String BintoSys(String x, int sys) {
        String digits = "01";
        String znak = "";
        String result = "";
        x = x.toUpperCase();
        int num = 0;
        int i = 0;
        if (x.charAt(0) == '-') {
            i = 1;
            znak = "-";
        }
        for (; i < x.length(); i++) {
            char c = x.charAt(i);

            if (digits.contains(c + "")) {
                result = result + c;
            } else {
                result = "0";
                znak = "";
                break;
            }
        }
        num = Integer.parseInt(result, 2);
        result = Integer.toString(num);
        if (num == 0) {
            znak = "";
        }
        switch (sys) {
            case 1:
                result = Integer.toOctalString(num).toUpperCase();
                break;
            case 2:
                result = Integer.toString(num);
                break;
            case 3:
                result = Integer.toHexString(num).toUpperCase();
                break;
        }
        return znak + result;
    }
}
