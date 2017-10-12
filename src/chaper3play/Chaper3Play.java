/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaper3play;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Chaper3Play 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        
        // The if Statement
        // Elevator example
        
//        int actualfloor;
//        if (floor > 13);
//        {
//            actualfloor = floor - 1;
//        }
//        else
//        {
//                actualfloor = floor;
//        }
        
        // Same concept, but with no else statement (not needed,
        // as the floor value will be correct without the else statement. 
        // Basically, if false (floor > 13), the floor will retain it's 
        // actual value. 
        
//        int actualfloor = floor;
//        if (floor > 13);
//        {
//            actualfloor--; 
//            // No else needed
//        }
        
        // Note: braces are not needed when a single statement is made
        // in an if stateent. (Good idea to always use braces, though)
        
//        if (floor > 13)
//            floor--;
        
        
        // The Conditional Operator
        // ex. condition ? value1 : value2
        // value of expression = value1 if true, and value2 if false. 
        // (Kinda like singular if statement)
        
//        int floor = 12;
//        int actualfloor = floor > 13 ? floor - 1 : floor;
        
        // Comparing Numbers and Strings
        int floor = 13; // Assign 13 to floor. 
        if (floor == 13) // Test whether floor equals 13.
        {
            floor = 13; // sets floor to 13 when if statement is true.
        }
        
        // Strings use different equals checking wording.
        // 3.2 syntax picture, middle example
        
        String input = "";
        if (input.equals("y")) // USE THIS FOR STRINGS INSTEAD OF ==
        {
            System.out.println("input = y."); // Prints when if statement is true.
        }
        else
        {
            System.out.println("input != y"); // Prints when if statement is not true.
        }
        
        // Exact comparison of Floating-Point Numbers
        // Shows floating point round off errors 
        
//        double r = Math.sqrt(2.0);
//        if (r * r == 2.0)
//        {
//            System.out.println("Math.sqrt(2.0) squared is 2.0");
//        }
//        else
//        {
//            System.out.println("Math.sqrt(2.0) squared is not 2.0 but " + r*r);
//        }
        
        // fix:
        
        final double epsilon = 1E-14;
        double r = Math.sqrt(2.0);
        if (Math.abs(r * r - 2.0) < epsilon)
        {
            System.out.println("Math.sqrt(2.0) squared is approx. 2.0");
        }
        else
        {
            System.out.println("Math.sqrt(2.0) squared is not 2.0 but " + r*r);
        }
        
        
        // Using == to compare strings
        // Works b/c exact same location and literal
        
        String nickname = "Rob";
        // ...
        if (nickname == "Rob")
        {
            System.out.println("Rob is his nickname");
        }
        
        // Doesn't work becuse name is modified from original
        
        String name = "Robert";
        String nicknamesame = name.substring(0, 3);
        // ...
        if (nicknamesame == "Rob")
        {
            System.out.println("Robert's short name is \"Rob\"");
        }
        else
        {
                System.out.println("Robert has no nickname");
        }
        
        // An if statement cannot have a else statent inside it's brackets, 
        // but an else statement can have multiple if statements 
        // inside it's brackets. 
        // ex. of if statement inside an if statement:
        
        String a = "a";
        if (a.equals("a"))
        {
            System.out.println("a = a");
            if (a.equals("a"))
            {
                System.out.println("if inside an if statement!");
            }
        }
        
        // if statements inside else statement
        
        if (1==1)
                {
                    
                }
        else
        {
            if (1==1)
                    {
                        
                    }
            if (1==1)
                    {
                        
                    }
            if (1==1)
                    {
                        
                    }
        }
        
        // Most of the time, else if will be used in betweeen if and else 
        // statements.
        // Think of it like a checklist, with everything coming after
        // the if statement having to follow the if statement's 
        // logic. 
        
        if (1==1)
        {
            
        }
        else if (1==1)
                {
                    
                }
        
        
        // Muliple Alternatives (else if)
        // Richter Scale ex. 
         // Added top 2 lines from original for flexability of testing
         
        // Change below value to test the conditions 
//        String richter = JOptionPane.showInputDialog( "Enter richterscale # ");
//        double richterdouble = Double.parseDouble(richter);
        // Constant float value
        float richterdouble = 5.5f;
        if (richterdouble >= 8.0)
        {
            System.out.println("Most structures fall.");
//            JOptionPane.showMessageDialog(null, "Most structures fall.");
        }
        else if (richterdouble >= 7.0)
        {
            System.out.println("Many buildings destroyed.");
//            JOptionPane.showMessageDialog(null, "Many buildings destroyed.");
        }
        else if (richterdouble >= 6.0)
        {
            System.out.println("Many buildings considerably damaged, some collapse.");
//            JOptionPane.showMessageDialog(null, "Many buildings considerably damaged, some collapse.");
        }
        else if (richterdouble >= 4.5)
        {
            System.out.println("Damage to poorly constructed buildings.");
//            JOptionPane.showMessageDialog(null, "Damage to poorly constructed buildings.");
        }
        // JOptionPane is used for dialogue output
        // System.out.println() is used for easier testing for the 
        // rest of this program.
        // Note: Order of the tests (else if statements) matters. 
        // Note: Multiple if() statements don't work either
        // This is because they will all print out their results,
        // independant of the information restraints that the others have.
        // (if all (or multiple) tests match as true. 
        
        
        // The switch statement
        int digit = 8;
        String digitName = "";
        
        switch(digit)
        {
            case 1:
                // do something
                digitName = "One";
                break;
                
            case 2:
                digitName = "Two";
                break;
                
            default:
                // other case not matching specific cases
                digitName = "Unhandled digit";
                break;
        }
        
        // Converts imput string to lowercase and compares it to cases
        switch(digitName.toLowerCase()) 
        {
            case "one":
                digit = 1;
                break;
        }
        // Note: Comparison can be both String() and int()
        
        // Example switch logic using #s for different outputs
        
        int digitReal = 3;
        
        switch(digitReal)
        {
            case 1: // 1 is a variable for a number or string to compare digitReal to.
                // do something
                digitReal = 3;
                break;
                
            case 3:
                // do something
                digitReal = 4;
                break;
                
            default:
                // other case not matching cases above
                digitReal = 0;
                break;
        }
        System.out.println(digitReal);
        // Note: switch statements can't make use of floating-point numbers
        // and the variable it is comparing the cases to MUST be constant. 
        // (check w/ dad)
        
        
        // Nested branches
        // Enumeration Types
        // See: public class TaxReturn
        
        
        // Boolean Varibales and Operators
        // Booleans are special values that can only be set to true or false. 
        boolean failed = true;
        if (failed) // only executed if failed has been set to true.
        {
            System.out.println("Program has failed! :(");
        }
        
        // Boolean Operators: Used to combine booleans
        // Three Boolean Operators: &&, ||, and !
        // && only happens when both said booleans are true. 
        // || only happens when either said booleans are true.
        
        
        // Input Validation
        floor = 13;
        
        // Checks if eithier of these 2 equasions are true
        if (floor <= 0 || floor > 20) 
        {
            System.out.println("Invalid floor: " + floor);
        }
        else if (floor == 13)
        {
            System.out.println("Invalid floor: " + floor);
        }
        else
        {
            System.out.println("Going to " + floor + "th floor");
        }
        
        
        
        
        
    }
}

//        public class TaxReturn // Enumeration Types (ask dad about this)
//        {
//            public enum FilingStatus
//            {
//                single, married, married_filing_separately
//            }
//            public static void main(String[] args)
//            {
//                // Put programming stuff here
//                FilingStatus status = FilingStatus.single;
//                System.out.println(status);
//            }
//            
//        } 