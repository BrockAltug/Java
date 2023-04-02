public class JavaCodeNotes
{
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//      --- START MAIN METHOD LIKE THIS ---
//            public class "Class name"
//            {
//                public static void main(String[] args)
//                {
//
//                }
//            }
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//            Helpful Quick Commands ---
//                ---
//        psvm (tab) - public static void main (String[] args){}
//        sout (tab) - System.out.println("Hello World!");
//        Scanner (scanner name) = new Scanner(System.in);    --- gets user input
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//            Data Types ---
//                ---
//      int - whole number (72) - 2147483647 max value
//      double - number with decimal (57.82)
//      boolean - true or false
//      String - words ("John")
//      char - a letter character ('Z')
//      byte - 8bit number (-128 minimum / 127 maximum)
//      short - 16bit number (-32,768 minimum / 32,768 maximum)
//      long - 64bit very large number (3459384593892342L)
//      float - data type that can store fractional numbers (74127f)
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//        Arithmetic Operations ---
//        ---
//      +  Addition
//      - Subtraction
//      * Multiplication
//      / Divison always round whole number unless double
//      % Modules - remainder number
//      && And - (a && b) means (a and b)
//      || Or - (a || b) means (a or b)
//      ! Is Not - (x != y) means (x does not equal y)
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//         Compound Operators ---
//         ---
//      += Plus Equal
//      -= Minus Equal
//      *= Times Equal
//      /= Divide Equal
//      %= Mod Equal (remainder)
//      ++ increase by 1 and assign the value back
//      -- decrease by 1 and assign the value back
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//         Casting ---
//         ---
//      //this will only show as integer 2 because nothing was cast as double and whole number 5 / whole number 2 = 2
//              System.out.println(5/2);
//   -----------------------------------------
//      //this is with casting and will show as double 2.5 because 5 was cast as (double) 5.0 before being divided by 2
//                System.out.println((double)5/2);
//   -----------------------------------------
//      //this will show as integer but cast (5/2) = 2 to double because of (). answer will be 2.0 because int 5/2 = 2 and (double) = 2.0
//             System.out.println((double)(5/2));
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//         Get User Input ---
//         ---
//      //create new scanner for user input
//      Scanner input = new Scanner(System.in);
//      //create new string and get the user input
//      String programmingLanguage = input.nextLine();
//      //display the user input
//      System.out.println("Your favorite language is " + programmingLanguage);
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//           Print out the sum of numbers ---
//           ---
//           //this will print out the sum of the numbers in num (7 + 8 + 9)
//           int num = 789;
//           int sum = 0;
//           sum += num % 10;
//           num /= 10;
//           sum += num % 10;
//           num /= 10;
//           sum += num % 10;
//           num /= 10;
//           System.out.println(sum);
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//           String Methods ---
//           ---
//      String.length() - will give the length (amount of chars) contained in the String
//      String.indexOf(String name) - will give the index starting location of the word in the string
//      String.substring(int from #, int to #) - will give the string from index start to end location picked from user
//      String.equals(String name) - checks if the strings are the same - true or false
//      String.compareTo(String name) - compares which comes first in alphabetical order - (A is 9 characters ahead of J (-9))
//      //positive result - the initial char / String comes after the comparedTo               attached to above line   ^^^^^
//      //negative result - the initial char / String comes before the comparedTo              attached to above line   ^^^^^
//      String.charAt(int) - finds the character contained at the index location in the String
//      String.isEmpty() - checks if the String contains anything in it - true or false
//      String.toUpperCase() - converts all characters in the String to upper case
//      String.toLowerCase() - converts all characters in the String to lower case
//      String.startsWith(String) - checks if the first word/char in the String matches - true or false
//      String.endsWith(String) - checks if the last word/char in the String matches - true or false
//      String.trim() - cuts off / trims any extra spaces contained in the String
//      String.replace(String 1, String 2) - replaces the String of 2 values
//      String.replaceAll(String 1, String2) - replaces everything between the 2 Strings
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//            Java Math Class Methods ---
//            ---
//      (Math.typeOfOperation()) - always write it like this
//      Math.abs(num1) - gives absolute value (positive number)
//      Math.pow(num,num) - gives the exponent value (2,3 = 2^3 = 8)
//      Math.sqrt(num) - gives square root value
//      Math.max(num1,num2,num3...) - gives the largest number between the values
//      Math.min(num1,num2,num3...) - gives the smallest number between the values
//      Math.round(num) - rounds to the nearest decimal point (3.2 = 3) (3.6 = 4)
//      Math.floor(num) - rounds down to the number (3.7 = 3)
//      Math.ceil(num) - rounds up to the number (3.2 = 4)
//      Math.PI - gives the value of pi
//      --
//      //for random numbers must add 1 to the end otherwise the index starts at 0, cast as int for whole number
//      Math.random() * 10 - gives random number from 0-9 as a decimal
//      --
//      ((int)(Math.random() * 10)) + 1) - gives random number from 1-10 as a whole number
//      --
//      //4 is the starting index location, the random numbers will be between 5 total values starting from 4 (4,5,6,7,8) 8 is the highest possible number
//      System.out.println((int) (Math.random() * 5) + 4);
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//            If, Else If, Else ---
//            ---
//          public class GradeExample
//           {
//              public static void main(String[] args) {
//                 Scanner scanner = new Scanner(System.in);
//                 System.out.println("Enter your grade");
//                    double grade = scanner.nextDouble();
//                  if (grade > 89){
//                      System.out.println("Your grade is A");
//                   } else if (grade > 79) {
//                      System.out.println("Your grade is B");
//                  } else if (grade > 69) {
//                      System.out.println("Your grade is C");
//                  }
//                    else if (grade > 59) {
//                      System.out.println("Your grade is D");
//                  }
//                  else {
//                      System.out.println("Your grade is F");
//                  }
//             }
//         }
//        --
//        Ternary Operator - easy way to write if else statement on a single line
//        int age = 19;
//        //new string variable for message
//        String message;
//        //checks if age is greater than or equal to 18 ?   if true - runs first String, if false - runs second String
//        message = age >= 18 ? "You can join the party." : "You are not allowed";
//        System.out.println(message);
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//         Switches ---
//         ---
//         public class SwitchExample
//            {
//              public static void main(String[] args) {
//                 Scanner scanner = new Scanner(System.in);
//                 System.out.println("Pick a selection between 1-5");
//                 System.out.println("1 - Burgers");
//                 System.out.println("2 - Pasta");
//                 System.out.println("3 - Pizza");
//                 System.out.println("4 - Appetizers");
//                 System.out.println("5 - Special");
//                 int selection = scanner.nextInt();
//                   //switch is to make a single selection
//                   //case between 1-5
//                   switch(selection){
//                       case 1:
//                          System.out.println("1. You selected Burgers Menu");
//                            break;
//                       case 2:
//                         System.out.println("2. You selected Pasta Menu");
//                          break;
//                     case 3:
//                         System.out.println("3. You selected Pizza Menu");
//                          break;
//                     case 4:
//                         System.out.println("4. You selected the Appetizers Menu");
//                          break;
//                      case 5:
//                          System.out.println("5. You selected the Daily Special");
//                          break;
//                      //if all selections fail, at the end of the switch / cases
//                      default:
//                          System.out.println("You didn't select a correct item from the menu!");
//                          break;
//                  }
//              }
//--------------------------------------------------------------------------------------------------------------------------------------------------------
}