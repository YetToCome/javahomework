/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.function;

/**
 *
 * @author 王佳唯
 */
public class PIMTodo extends PIMEntity {
    public String data;
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
