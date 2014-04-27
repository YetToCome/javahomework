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
public class PIMAppointment extends PIMEntity {
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

