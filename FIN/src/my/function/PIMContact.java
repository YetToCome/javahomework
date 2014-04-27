/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.function;

/**
 *
 * @author YetToCome
 */
public class PIMContact extends PIMEntity {
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

