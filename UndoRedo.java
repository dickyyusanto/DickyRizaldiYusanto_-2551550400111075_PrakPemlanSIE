package SMT2.Laprak7;

import java.util.Stack;
import java.util.Scanner;
import java.util.*;

public class UndoRedo {
    
    Stack<String> undoStack = new Stack<>();
    Stack<String> redoStack = new Stack<>();

   
    public void action(String command) {
        System.out.println("Action: " + command);
        undoStack.push(command);
        redoStack.clear();
        printState();      
    }

    public static void print(Stack<String> stack) {
    System.out.print("Stack Undo: ");
    for(String s: stack)
        System.out.print(s + " ");
    System.out.println();
    }

    public void undo() {
        if (undoStack.isEmpty())
        System.out.println("Nothing to undo.");
    else {
        String item = undoStack.pop(); 
        redoStack.push(item);          
        System.out.println("Undoing: " + item);
    }
    printState();
    }

   
    public void redo() {
         if (redoStack.isEmpty())
        System.out.println("Nothing to redo.");
    else {
        String item = redoStack.pop(); 
        undoStack.push(item);          
        System.out.println("Redoing: " + item);
    }
    printState(); 
    }

    public void printState() {
        System.out.print("Stack Undo: ");
    System.out.println(undoStack); 
    
    System.out.print("Stack Redo: ");
    System.out.println(redoStack); 
    System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        UndoRedo app = new UndoRedo();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("Ketikkan teks sebagai command.");
            System.out.println("Ketik U untuk melakukan Undo");
            System.out.println("Ketik R untuk melakukan Redo");
            System.out.println("Ketik X untuk mengakhiri program.");
            System.out.print("Command: ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("x")) break;

            if (command.equalsIgnoreCase("u")) {
                app.undo();
            } else if (command.equalsIgnoreCase("r")) {
                app.redo();
            } else {
                app.action(command);
            }
        }
        scanner.close();
        System.out.println("Program selesai.");
    }
}
