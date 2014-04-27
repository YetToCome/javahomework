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
public class PIMNote extends PIMEntity {
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
