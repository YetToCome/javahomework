/*************************************************************************
	> File Name: PIMAppointment.java
	> Author: WJW
	> Mail: 1971767787@qq.com
	> Created Time: 2014年03月18日 星期二 10时37分31秒
 ************************************************************************/

class PIMAppointment extends PIMEntity {
    String description;
    public void fromString(String s) {
        origin_string = s;
        String[] arr_line = s.split("\\+");
        description = arr_line[0];
        setPriority(arr_line[1]);

    }
    public String toString() {
        return getPriority() + description;
    }
}
