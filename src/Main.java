/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int max = Integer.MIN_VALUE;
            int curMax = 0;
            //表示一共有n个数据
            int n = scanner.nextInt();
            int[] a = new int[n];
            //输入n个数据，存入到数组中
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                curMax += a[i];
                max = Math.max(curMax,max);
                if (curMax < 0) {
                    curMax = 0;
                }
            }
            System.out.println(max);

        }
    }
}*/


/*
import java.util.Scanner;

public class Main {
    static int x, y;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] str = scanner.nextLine().split(";");
            x = y = 0;
            for(String  s : str) {
                if (s.length() == 2 || s.length() == 3) {
                    move(s);
                }
            }
            System.out.println(x + "," + y);
        }
    }

    private static void move(String s) {
        char[] c = new char[3];
        char[] t = s.toCharArray();
        if(s.length() == 2) {
            c[0] = t[0];
            c[1] = '0';
            c[2] = t[1];
        } else{
            c = t;
        }
        switch(c[0]) {
            case 'W' :
                if(c[1] >= '0' && c[1] <= '9' && c[2] >= '0' && c[2] <= '9') {
                    y = y + ((c[1] - '0') * 10) + (c[2] - '0');
                }
                break;
            case 'A' :
                if(c[1] >= '0' && c[1] <= '9' && c[2] >= '0' && c[2] <= '9') {
                    x = x - (((c[1] - '0') * 10) + (c[2] - '0'));
                }
                break;
            case 'D' :
                if(c[1] >= '0' && c[1] <= '9' && c[2] >= '0' && c[2] <= '9') {
                    x = x + ((c[1] - '0') * 10) + (c[2] - '0');
                }
                break;
            case 'S' :
                if(c[1] >= '0' && c[1] <= '9' && c[2] >= '0' && c[2] <= '9') {
                    y = y - (((c[1] - '0') * 10) + (c[2] - '0'));
                }
                break;
            default:
                break;
        }
    }
}*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.nextLine();

            String[] str = s.split(";");

            int row = 0;
            int column = 0;

            for (int i = 0; i < str.length; i++) {
                if (str[i].length() <= 3) {
                    if (str[i].charAt(0) == 'A' && str[i].substring(1).matches("[0-9]+")) {
                        row -= Integer.parseInt(str[i].substring(1));
                    }

                    if (str[i].charAt(0) == 'D' && str[i].substring(1).matches("[0-9]+")) {
                        row += Integer.parseInt(str[i].substring(1));
                    }

                    if (str[i].charAt(0) == 'W' && str[i].substring(1).matches("[0-9]+")) {
                        column += Integer.parseInt(str[i].substring(1));
                    }

                    if (str[i].charAt(0) == 'S' && str[i].substring(1).matches("[0-9]+")) {
                        column -= Integer.parseInt(str[i].substring(1));
                    }
                }
            }

            System.out.println(row + "," + column);
        }

    }
}