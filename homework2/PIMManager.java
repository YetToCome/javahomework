/*************************************************************************
	> File Name: PIMManager.java
	> Author: WJW
	> Mail: 1971767787@qq.com
	> Created Time: 2014年03月18日 星期二 10时50分57秒
 ************************************************************************/
import java.util.*;
import java.io.*;

class PIMManager {
    public static ArrayList Pim_Todo = new ArrayList();
    public static ArrayList Pim_Note = new ArrayList();
    public static ArrayList Pim_Contact = new ArrayList();
    public static ArrayList Pim_Appointment = new ArrayList();
    public static void main(String args[]) {
        System.out.println("Welcome to PIM\n---Enter a command (suported commands are List Create Save Load Quit)---");
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        while (!command.equals("Quit") ) {
            if (command.equals("List")) {
                String first_line = "There is " + Pim_Todo.size() + Pim_Note.size() + Pim_Contact.size() + " items";
                System.out.println(first_line);
                for (int i = 0; i != Pim_Todo.size(); ++i) {
                    String print_line = "Item " + (i + 1) + " " + Pim_Todo.get(i).toString();
                    System.out.println(print_line);
                }
                for (int i = 0; i != Pim_Note.size(); ++i) {
                    String print_line = "Item " + (i + 1 + Pim_Todo.size()) + " " + Pim_Note.get(i).toString();
                    System.out.println(print_line);
                }
                for (int i = 0; i != Pim_Contact.size(); ++i) {
                    String print_line = "Item " + (i + 1 + Pim_Todo.size() + Pim_Note.size()) + " " + Pim_Contact.get(i).toString();
                    System.out.println(print_line);
                }
                for (int i = 0; i != Pim_Appointment.size(); ++i) {
                    String print_line = "Item " + (i + 1 + Pim_Todo.size() + Pim_Note.size() + Pim_Contact.size()) + " " + Pim_Appointment.get(i).toString();
                    System.out.println(print_line);
                }
            } else if (command.equals("Create")) {
                System.out.println("Enter an item type ( todo, note, contact or appointment )");
                Scanner scan_create = new Scanner(System.in);
                String create_string = scan_create.nextLine();
                if (create_string.equals("todo")) {
                    PIMTodo newPimTodo = new PIMTodo();
                    String final_line = "";
                    Scanner final_scan = new Scanner(System.in);
                    System.out.println("Entry data for todo item");
                    final_line += final_scan.nextLine() + "+";
                    System.out.println("Entry todo text");
                    final_line += final_scan.nextLine() + "+";
                    System.out.println("Entry Priority");
                    final_line += final_scan.nextLine();
                    newPimTodo.fromString(final_line);
                    Pim_Todo.add(newPimTodo);
                } else if (create_string.equals("note")) {
                    PIMNote newPimNote = new PIMNote();
                    String final_line = "";
                    Scanner final_scan = new Scanner(System.in);
                    System.out.println("Entry todo text");
                    final_line += final_scan.nextLine() + "+";
                    System.out.println("Enery Priority");
                    final_line += final_scan.nextLine();
                    newPimNote.fromString(final_line);
                    Pim_Note.add(newPimNote);
                } else if (create_string.equals("contact")) {
                    PIMContact newPimContact = new PIMContact();
                    String final_line = "";
                    Scanner final_scan = new Scanner(System.in);
                    System.out.println("Entry first name");
                    final_line += final_scan.nextLine() + "+";
                    System.out.println("Entry last name");
                    final_line += final_scan.nextLine() + "+";
                    System.out.println("Entry e-mail address");
                    final_line += final_scan.nextLine() + "+";
                    System.out.println("Entry Priority");
                    final_line += final_scan.nextLine();
                    newPimContact.fromString(final_line);
                    Pim_Contact.add(newPimContact);
                    
                } else if (create_string.equals("appointment")) {
                    PIMAppointment newPimAppoinement = new PIMAppointment();
                    String final_line = "";
                    Scanner final_scan = new Scanner(System.in);
                    System.out.println("Enter description");
                    final_line += final_scan.nextLine() + "+";
                    System.out.println("Enter Priority");
                    final_line += final_scan.nextLine();
                    newPimAppoinement.fromString(final_line);
                    Pim_Appointment.add(newPimAppoinement);
                } else {
                    System.out.println("Wrong Command");
                }
            } else if (command.equals("Save")) {
                
            } else if (command.equals("Load")) {

            } else {
                System.out.println("Wrong Command!!");
            }
            command = scan.nextLine();
        }
    }
}
