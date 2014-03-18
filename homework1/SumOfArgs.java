/*************************************************************************
	> File Name: SumOfArgs.java
	> Author: WJW
	> Mail: 1971767787@qq.com
	> Created Time: 2014年03月04日 星期二 16时50分34秒
 ************************************************************************/

public class SumOfArgs {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            if (isNumeric(args[i])) sum += Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
    private static boolean isNumeric(String str) {
    	for (int i = str.length();--i>=0;) {
    		if (!Character.isDigit(str.charAt(i))) {
    			return false;
            }
        }
        return true;
    }
}
