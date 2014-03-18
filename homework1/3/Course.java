/*************************************************************************
	> File Name: Course.java
	> Author: WJW
	> Mail: 1971767787@qq.com
	> Created Time: 2014年03月04日 星期二 17时31分52秒
 ************************************************************************/

public class Course {
    public static void main(String args[]) {
        if (args.length == 1) {
            Student S = new Student(args[0]);        
            System.out.println(args[0] + "choose" + "nothing");
        } else if (args.length == 2) {
            Student S = new Student(args[0], args[1]);
            System.out.println(args[0] + " choose " + args[1]);
        } else if (args.length == 3) {
            Student S = new Student(args[0], args[1], args[2]);
            System.out.println(args[0] + " choose " + args[1] + " and " + args[2]);
        }
    }
}
