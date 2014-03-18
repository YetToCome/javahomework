/*************************************************************************
	> File Name: Substring.java
	> Author: WJW
	> Mail: 1971767787@qq.com
	> Created Time: 2014年03月04日 星期二 17时09分59秒
 ************************************************************************/

public class Substring {
    public static void main(String args[]) {
        String output = "";
        for (int i = 0; i < Integer.parseInt(args[2]); i++) {
            output += args[0].charAt(i + Integer.parseInt(args[1]));
        }
        System.out.println(output);
    }
}
