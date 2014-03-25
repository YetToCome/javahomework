/*************************************************************************
	> File Name: cal.java
	> Author: WJW
	> Mail: 1971767787@qq.com
	> Created Time: 2014年03月25日 星期二 10时42分11秒
 ************************************************************************/
import java.util.Calendar;

public class cal {
    public static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public static void print_cal(int month, int year) {
        System.out.println(months[month] + " " + year);
        month += 1;
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        String str = "Su\tMo\tTu\tWe\tTh\tFr\tSa\r";
        int day = 0;
        if (month % 2 == 1) day = 31;
        else {
            if (month != 2) day = 30;
            else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) day = 29;
            else day = 28;
        }
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int idx = calendar.get(Calendar.DAY_OF_WEEK);
        String SB = new String();
        for (int i = 0; i < idx - 1; ++i) SB = SB + " \t";
        if (Calendar.SATURDAY == idx) SB = SB + calendar.get(Calendar.DAY_OF_MONTH) + "\r\n";
        else SB = SB + calendar.get(Calendar.DAY_OF_MONTH) + "\t";
        System.out.println(str);
        for (int i = 2; i <= day; ++i) {
            calendar.set(Calendar.DAY_OF_MONTH, i);
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) SB = SB + i + "\r\n";
            else SB = SB + i + "\t";
        }
        System.out.println(SB);
    }
    public static void print_cal() {
        Calendar calendar = Calendar.getInstance();
        print_cal(calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR));
    }
    public static void main(String[] args) {
        if (args.length > 1)
            print_cal(Integer.parseInt(args[0]) - 1, Integer.parseInt(args[1]));
        else 
            print_cal();
    } 
}
