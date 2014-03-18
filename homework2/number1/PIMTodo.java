/*************************************************************************
	> File Name: PIMTodo.java
	> Author: WJW
	> Mail: 1971767787@qq.com
	> Created Time: 2014年03月18日 星期二 10时28分19秒
 ************************************************************************/

class PIMTodo extends PIMEntity {
    String data;
    String text;
    public void fromString(String s) {
        origin_string = s;
        String array[] = s.split("\\+");
        data = array[0];
        text = array[1];
        setPriority(array[2]);
    }
    public String getOrigin() {
        return super.getOriginString();
    }
    public String toString() {
        return getPriority() + " " + data + " " + text;
    }
}
