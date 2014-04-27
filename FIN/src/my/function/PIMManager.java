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
import java.util.*;
import java.io.*;

public class PIMManager {
    public static String list(ArrayList<PIMTodo> Pim_Todo, ArrayList<PIMNote> Pim_Note, ArrayList<PIMContact> Pim_Contact, ArrayList<PIMAppointment> Pim_Appointment) {
        String first_line = "There is " + (Pim_Todo.size() + Pim_Note.size() + Pim_Contact.size() + Pim_Appointment.size())+ " items";
        //System.out.println(first_line);
        for (int i = 0; i != Pim_Todo.size(); ++i) {
            String print_line = "Item " + (i + 1) + " " + Pim_Todo.get(i).toString();
            first_line = first_line + "\n" + print_line;
        }
        for (int i = 0; i != Pim_Note.size(); ++i) {
            String print_line = "Item " + (i + 1 + Pim_Todo.size()) + " " + Pim_Note.get(i).toString();
            first_line = first_line + "\n" + print_line;
        }
        for (int i = 0; i != Pim_Contact.size(); ++i) {
            String print_line = "Item " + (i + 1 + Pim_Todo.size() + Pim_Note.size()) + " " + Pim_Contact.get(i).toString();
            first_line = first_line + "\n" + print_line;
        }
        for (int i = 0; i != Pim_Appointment.size(); ++i) {
            String print_line = "Item " + (i + 1 + Pim_Todo.size() + Pim_Note.size() + Pim_Contact.size()) + " " + Pim_Appointment.get(i).toString();
            first_line = first_line + "\n" + print_line;
        }
        return first_line;
    }
    public static void save(ArrayList<PIMTodo> Pim_Todo, ArrayList<PIMNote> Pim_Note, ArrayList<PIMContact> Pim_Contact, ArrayList<PIMAppointment> Pim_Appointment) {
        try {
                    File file = new File("1.txt");
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    for (int i = 0; i < Pim_Todo.size(); ++i) {
                        String line = "todo|" + Pim_Todo.get(i).getOriginString();
                        writer.write(line + "\n");
                    }
                    for (int i = 0; i < Pim_Note.size(); ++i) {
                        String line = "note|" + Pim_Note.get(i).getOriginString();
                        writer.write(line + "\n");
                    }
                    for (int i = 0; i < Pim_Appointment.size(); ++i) {
                        String line = "appointment|" + Pim_Appointment.get(i).getOriginString();
                        writer.write(line + "\n");
                    }
                    for (int i = 0; i < Pim_Contact.size(); ++i) {
                        String line = "contact|" + Pim_Contact.get(i).getOriginString();
                        writer.write(line + "\n");
                    }
                    writer.close();
                } catch(Exception e) {
                    e.printStackTrace();
                }
    }
    public static void load(ArrayList<PIMTodo> Pim_Todo, ArrayList<PIMNote> Pim_Note, ArrayList<PIMContact> Pim_Contact, ArrayList<PIMAppointment> Pim_Appointment) {
        try {
                if(Pim_Todo.size() >= 1)
                    Pim_Todo.clear();
                if (Pim_Note.size() >= 1)
                    Pim_Note.clear();
                if (Pim_Appointment.size() >= 1)
                    Pim_Appointment.clear();
                if (Pim_Contact.size() >= 1)
                    Pim_Contact.clear();
                File file = new File("1.txt");
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line = reader.readLine();
                    while (line != null) {
                        String[] sp = line.split("\\|");
                        if (sp[0].equals("todo")) {
                            PIMTodo newtodo = new PIMTodo();
                            newtodo.fromString(sp[1]);
                            Pim_Todo.add(newtodo);
                        } else if (sp[0].equals("note")) {
                            PIMNote newnote = new PIMNote();
                            newnote.fromString(sp[1]);
                            Pim_Note.add(newnote);
                        } else if (sp[0].equals("appointment")) {
                            PIMAppointment newapp = new PIMAppointment();
                            newapp.fromString(sp[1]);
                            Pim_Appointment.add(newapp);
                        } else if (sp[0].equals("contact")) {
                            PIMContact newcontact = new PIMContact();
                            newcontact.fromString(sp[1]);
                            Pim_Contact.add(newcontact);
                        }
                        line = reader.readLine();
                    }
                    reader.close();
                } catch(Exception e) {
                    e.printStackTrace();
                }
    }
    public static void main(String args[]) {
        ArrayList<PIMTodo> Pim_Todo = new ArrayList<PIMTodo>();
        ArrayList<PIMNote> Pim_Note = new ArrayList<PIMNote>();
        ArrayList<PIMContact> Pim_Contact = new ArrayList<PIMContact>();
        ArrayList<PIMAppointment> Pim_Appointment = new ArrayList<PIMAppointment>();
        System.out.println("Welcome to PIM\n---Enter a command (suported commands are List Create Save Load Quit)---");
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        while (!command.equals("Quit") ) {
            if (command.equals("List")) {
                String first_line = "There is " + (Pim_Todo.size() + Pim_Note.size() + Pim_Contact.size() + Pim_Appointment.size())+ " items";
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
                try {
                    File file = new File("1.txt");
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    for (int i = 0; i < Pim_Todo.size(); ++i) {
                        String line = "todo|" + Pim_Todo.get(i).getOriginString();
                        writer.write(line + "\n");
                    }
                    for (int i = 0; i < Pim_Note.size(); ++i) {
                        String line = "note|" + Pim_Note.get(i).getOriginString();
                        writer.write(line + "\n");
                    }
                    for (int i = 0; i < Pim_Appointment.size(); ++i) {
                        String line = "appointment|" + Pim_Appointment.get(i).getOriginString();
                        writer.write(line + "\n");
                    }
                    for (int i = 0; i < Pim_Contact.size(); ++i) {
                        String line = "contact|" + Pim_Contact.get(i).getOriginString();
                        writer.write(line + "\n");
                    }
                    writer.close();
                } catch(Exception e) {
                    e.printStackTrace();
                }
            } else if (command.equals("Load")) {
                try {
                    Pim_Todo.clear();
                    Pim_Note.clear();
                    Pim_Appointment.clear();
                    Pim_Contact.clear();
                    File file = new File("1.txt");
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line = reader.readLine();
                    while (line != null) {
                        String[] sp = line.split("\\|");
                        if (sp[0].equals("todo")) {
                            PIMTodo newtodo = new PIMTodo();
                            newtodo.fromString(sp[1]);
                            Pim_Todo.add(newtodo);
                        } else if (sp[0].equals("note")) {
                            PIMNote newnote = new PIMNote();
                            newnote.fromString(sp[1]);
                            Pim_Note.add(newnote);
                        } else if (sp[0].equals("appointment")) {
                            PIMAppointment newapp = new PIMAppointment();
                            newapp.fromString(sp[1]);
                            Pim_Appointment.add(newapp);
                        } else if (sp[0].equals("contact")) {
                            PIMContact newcontact = new PIMContact();
                            newcontact.fromString(sp[1]);
                            Pim_Contact.add(newcontact);
                        }
                        line = reader.readLine();
                    }
                    reader.close();
                } catch(Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Wrong Command!!");
            }
            command = scan.nextLine();
        }
    }
}
