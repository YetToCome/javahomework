/*************************************************************************
	> File Name: Student.java
	> Author: WJW
	> Mail: 1971767787@qq.com
	> Created Time: 2014年03月04日 星期二 17时30分55秒
 ************************************************************************/

public class Student {
    String StudentCode;
    Book B1, B2;

    public Student(String Code) {
        StudentCode = Code;
    }
    public Student(String Code, String CLA1) {
        StudentCode = Code;
        B1 = new Book(CLA1);
    }
    public Student(String Code, String CLA1, String CLA2) {
        StudentCode = Code;
        B1 = new Book(CLA1);
        B2 = new Book(CLA2);
    }
}
