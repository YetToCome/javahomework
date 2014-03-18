/*************************************************************************
	> File Name: PIMContact.java
	> Author: WJW
	> Mail: 1971767787@qq.com
	> Created Time: 2014年03月18日 星期二 10时39分29秒
 ************************************************************************/

class PIMContact extends PIMEntity {
    String first_name, last_name, email_address;
    public void fromString(String s) {
        origin_string = s;
        String[] arr_line = s.split("\\+");
        first_name = arr_line[0];
        last_name = arr_line[1];
        email_address = arr_line[2];
        setPriority(arr_line[3]);
    }
    public String toString() {
        return getPriority() + " " + first_name + " " + last_name + " " + email_address;
    }
}
