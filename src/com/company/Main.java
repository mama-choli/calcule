package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String[] strings = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    public static String[] ints = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};



    public static String convert(int in) {
        StringBuffer a = new StringBuffer("");
        if (in == 100) {
            return "C";
        } else {
            int l1;
            int l2;
            int x1;
            if (in >= 50) {
                l1 = in / 10;
                a.append(L(l1));
                l2 = in % 50;
                x1 = l2 / 10;
                a.append(X(x1));
                int x2 = l2 % 10;
                a.append(basic(x2));
            } else {
                l1 = in % 50;
                l2 = l1 / 10;
                a.append(XL(l2));
                x1 = l1 % 10;
                a.append(basic(x1));
            }

            return a.toString();
        }
    }

    private static String X(int in) {
        if (in != 0 && in < 4) {
            StringBuffer a = new StringBuffer("");

            for(int i = 0; i < in; ++i) {
                a.append("X");
            }

            return a.toString();
        } else {
            return "";
        }
    }

    private static String XL(int in) {
        if (in == 4) {
            return "XL";
        } else if (in != 0 && in < 4) {
            StringBuffer a = new StringBuffer("");

            for(int i = 0; i < in; ++i) {
                a.append("X");
            }

            return a.toString();
        } else {
            return "";
        }
    }

    private static String L(int in) {
        if (in == 9) {
            return "XC";
        } else if (in != 0 && in < 9) {
            StringBuffer a = new StringBuffer("");
            a.append("L");
            return a.toString();
        } else {
            return "";
        }
    }

    private static String basic(int in) {
        String[] a = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return a[in];
    }

    public static boolean useList(String[] arr, String targetValue) {
        return Arrays.asList(arr).contains(targetValue);
    }

    public static void off() {
        System.out.println("OFF");
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String v = r.nextLine();
        String[] y = v.split(" ");
        if (y.length == 3) {
            String p = y[0];
            String z = y[1];
            String h = y[2];
            String[] l = strings;
            String[] q = ints;
            if (useList(l, p) && useList(l, h)) {
                Roman gg = Roman.valueOf(y[0]);
                Roman g = Roman.valueOf(y[2]);
                int ii = gg.getValue();
                int oo = g.getValue();
                byte var15 = -1;
                switch(z.hashCode()) {
                    case 42:
                        if (z.equals("*")) {
                            var15 = 2;
                        }
                        break;
                    case 43:
                        if (z.equals("+")) {
                            var15 = 0;
                        }
                    case 44:
                    case 46:
                    default:
                        break;
                    case 45:
                        if (z.equals("-")) {
                            var15 = 1;
                        }
                        break;
                    case 47:
                        if (z.equals("/")) {
                            var15 = 3;
                        }
                }

                int sum;
                switch(var15) {
                    case 0:
                        sum = ii + oo;
                        System.out.println(convert(sum));
                        break;
                    case 1:
                        sum = ii - oo;
                        if (sum > 0) {
                            System.out.print(convert(sum));
                        } else {
                            off();
                        }
                        break;
                    case 2:
                        sum = ii * oo;
                        System.out.print(convert(sum));
                        break;
                    case 3:
                        sum = ii / oo;
                        System.out.print(convert(sum));
                        break;
                    default:
                        off();
                }
            } else if (useList(q, p) && useList(q, h)) {
                int i = Integer.parseInt(y[0]);
                int o = Integer.parseInt(y[2]);
                byte var12 = -1;
                switch(z.hashCode()) {
                    case 42:
                        if (z.equals("*")) {
                            var12 = 2;
                        }
                        break;
                    case 43:
                        if (z.equals("+")) {
                            var12 = 0;
                        }
                    case 44:
                    case 46:
                    default:
                        break;
                    case 45:
                        if (z.equals("-")) {
                            var12 = 1;
                        }
                        break;
                    case 47:
                        if (z.equals("/")) {
                            var12 = 3;
                        }
                }

                switch(var12) {
                    case 0:
                        System.out.print(i + o);
                        break;
                    case 1:
                        System.out.print(i - o);
                        break;
                    case 2:
                        System.out.print(i * o);
                        break;
                    case 3:
                        System.out.print(i / o);
                        break;
                    default:
                        off();
                }
            } else {
                off();
            }
        } else {
            off();
        }

    }
    }

