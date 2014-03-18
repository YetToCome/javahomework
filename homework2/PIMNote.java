/*************************************************************************
	> File Name: PIMNote.java
	> Author: WJW
	> Mail: 1971767787@qq.com
	> Created Time: 2014年03月18日 星期二 10时34分40秒
 ************************************************************************/

class PIMNote extends PIMEntity {
    String text;
    public void fromString(String s) {
        origin_string = s;
        String[] arr_line = s.split("\\+");
        text = arr_line[0];
        setPriority(arr_line[1]);
    }
    public String toString() {
        return text;
    }
}
