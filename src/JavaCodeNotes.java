
//    useful notes for java -
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//  --- VOCABULARY / TERMS / HELPFUL THINGS ---
//        Abstraction - storing unwanted details while giving out the most essential details, supported using interface and abstract class
//        Encapsulation - storing data (variables) and code (methods) into a single unit, supported using access modifiers (public, private, protected, default)
//        Public - can be accessed from anywhere
//        Private - can only be accessed within the same class
//        Protected - can only be accessed within the package or sub packages
//        Default - can only be accessed within the package or sub packages
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//  --- START MAIN METHOD LIKE THIS ---
//            public class "Class name"
//            {
//                public static void main(String[] args)
//                {
//
//                }
//            }
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//        Helpful Quick Commands ---
//            ---
//        psvm (tab) - public static void main (String[] args){}
//        sout (tab) - System.out.println("Hello World!");
//        Scanner (scanner name) = new Scanner(System.in);    --- gets user input
//        ctrl + cmd + l ---  will organize everything to look nicely
//        TODO - highlights the code for things to do
//        Extract Method - highlight the method, right click - refactor - extract method - will make the highlighted code into a method
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//        Data Types ---
//            ---
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
//     Arithmetic Operations ---
//     ---
//      +  Addition
//      - Subtraction
//      * Multiplication
//      / Divison always round whole number unless double
//      % Modules - remainder number
//      && And - (a && b) means (a and b)
//      || Or - (a || b) means (a or b)
//      ! Is Not - (x != y) means (x does not equal y)
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//     Compound Operators ---
//     ---
//      += Plus Equal
//      -= Minus Equal
//      *= Times Equal
//      /= Divide Equal
//      %= Mod Equal (remainder)
//      ++ increase by 1 and assign the value back
//      -- decrease by 1 and assign the value back
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//     Casting ---
//     ---
//      //this will only show as integer 2 because nothing was cast as double and whole number 5 / whole number 2 = 2
//              System.out.println(5/2);
//   -----------------------------------------
//      //this is with casting and will show as double 2.5 because 5 was cast as (double) 5.0 before being divided by 2
//                System.out.println((double)5/2);
//   -----------------------------------------
//      //this will show as integer but cast (5/2) = 2 to double because of (). answer will be 2.0 because int 5/2 = 2 and (double) = 2.0
//             System.out.println((double)(5/2));
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//     Get User Input ---
//     ---
//      //create new scanner for user input
//      Scanner input = new Scanner(System.in);
//      //create new string and get the user input
//      String programmingLanguage = input.nextLine();
//      //display the user input
//      System.out.println("Your favorite language is " + programmingLanguage);
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//       Print out the sum of numbers ---
//       ---
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
//       String Methods ---
//       ---
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
//        Java Math Class Methods ---
//        ---
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
//
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//       method to parse to do math with Strings

//public class ParseIntMethod {
//    public static void main(String[] args) {
//        String numberString1 = "34";
//        String numberString2 = "35";
//        //will display the numbers as a string
//        System.out.println(numberString1+numberString2);
//        //parse for int to do math with Strings
//        int num1 = Integer.parseInt(numberString1);
//        int num2 = Integer.parseInt(numberString2);
//        //will add the numbers and display the sum
//        System.out.println(num1+num2);
//    }
//}
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//        If, Else If, Else ---
//        ---
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
//         For / While Loops ---
//         ---
//    --------------------- for loop and while Loop to print the sum of the numbers ---------------------
//      public static void main(String[] args) {
//        //example of for loop to make a countdown from 10
//        //starting from 10, until 0, countdown by 1
//        for (int i = 10; i >=0 ; i--) {
//            //display counting down and the number
//            System.out.println("counting down " + i);
//        }
//    --------------------- while Loop to print the sum of the numbers ---------------------
//     public static void main(String[] args) {
//        //new scanner for user input
//        Scanner input = new Scanner(System.in);
//        //prompt user to enter a number
//        System.out.println("Enter a number");
//        //new variable to get users input as a number
//        int userInput = input.nextInt();   //test with number 234
//        //new int for the total starting at 0 to get the total value of all the digits
//        int total = 0;
//        while (userInput != 0) {
//            //do math to separate all the digits from each other
//            //mod by 10 to get the 1s digit as a remainder
//            int digit = userInput % 10;   //234 - example number
//            //add the ones digit to the total
//            total += digit;   //4
//            //will show the total of each digit starting with the ones digit
//            System.out.print(total + ", ");
//            //to get the 10s digit, divide by 10 because ints will always give whole number
//            userInput = userInput / 10;   //23
//        }
//        System.out.println(": The sum of the digits in the number is " + total);
//    }
//     --------------------------- while loop -------------------------------
//        //example of while loop to make a countdown from 10
//        //new int variable for counter
//        int counter = 10;
//        //while counter is greater than or equal to zero
//        while(counter>=0){
//            //display the count
//            System.out.println("counting down " + counter);
//            //count down
//            counter--;
//        }
//    }
//      --------------------- for loop to print the sum of the numbers ---------------------
//          public static void main(String[] args) {
//          Write a for loop to find
//          the sum of the numbers between 1 and 5.
//
//        //new int variable sum starting from 0
//        int sum = 0;
//        //starting from 1 until 5, add 1
//        for (int i = 1; i <=5 ; i++) {
//            //print the sum
//            System.out.println(sum);
//            //sum = sum + i
//            //(0+1)(1+2)(3+3)(6+4)(10+5) = 15
//            sum = sum + i;
//        }
//        //display the total (15)
//        System.out.println("result: " + sum);
//    }
//      --------------------- for loop String Transversal ---------------------
//      public static void main(String[] args) {
//        String str1 = "Hello";
//
//        //starting at 0, until String str1 length, add 1
//        for (int i = 0; i < str1.length(); i++) {
//            //display the substring at beginning index i, and end index i + 1, this will only give 1 letter at a time
//            System.out.println(str1.substring(i, i+1));
//            //display the char at index location i in String str1
//            System.out.println("with charAt(i) " + str1.charAt(i));
//        }
//        //display this at the end of the for loop
//        System.out.println("Something");
//    }
//    --------------------- String Transversal and writing a word backwards ---------------------
//     public static void main(String[] args) {
//        String str1 = "World";
//        //starting at 1, until the Strings length, add 1
//        for (int i = 0; i < str1.length(); i++) {
//            //display the substring starting at i until i+1 (0,0+1) to get each index letter 1 at a time
//            System.out.println(str1.substring(i, i+1));
//        }
//        System.out.println("+++++Reversed Version++++++++++");
//        //starting at String legnth - 1, until 0, subtract 1
//        for (int i = str1.length() - 1; i >=0 ; i--) {
//            //display the substrings and +1 to display 1 letter at a time
//            System.out.println(str1.substring(i, i+1));
//        }
//        System.out.println("+++++charAt() Version++++++++++");
//        //same way to write as the first method with charAt instead of substring
//        for (int i = 0; i < str1.length(); i++) {
//            System.out.println(str1.charAt(i));
//        }
//       --------------------- check how many of the same char is contained in a string ---------------------
//     public static void main(String[] args) {
//        //create a new string for a word
//        String str1 = "Argentina";
//        //new count starting from 0
//        int count = 0;
//        //starting from 0, until the string length add 1
//        for (int i = 0; i < str1.length(); i++) {
//            //checks letter by letter using substring to see how many a's are contained in the String
//            if (str1.substring(i, i + 1).contains("a") || str1.substring(i, i + 1).contains("A")){
//                //if any a's are contained, increase the count
//                count++;
//            }
//        }
//        //display the number of a's in the String
//        System.out.println("There are " + count + " \"a\"s in the " + str1);
//
//    }
//       --------------------- checks if a String contains any vowels ---------------------
//      public static void main(String[] args) {
//        //new String sentence
//        String champ = "Morocco is the best!";
//        //counter starting at 0
//        int counter = 0;
//        //starting from 0, until the length of the string, add 1
//        for (int i = 0; i < champ.length(); i++) {
//            //string string checks letter by letter using substring
//            String check = champ.substring(i, i+1);
//            //call to the isVowel method using check to see letter by letter if it contains any of the vowels
//            if(isVowel(check)){
//                //if it contains any vowel, add 1
//                counter++;
//            }
//
//        }
//        //display the count of vowels
//        System.out.println("There are " + counter + " vowels in " + champ);
//    }
//
//    //new method true or false to see if there is a vowel or not
//    //1 parameter for check
//    public static boolean isVowel(String check){
//        //checking letter by letter, if any letter equals a vowel
//        if(check.equals("a") || check.equals("e") || check.equals("i") || check.equals("o") || check.equals("u")){
//            //return true to the counter
//            return true;
//            //else return false and do not increase counter
//        } else {
//            return false;
//        }
//    }
//       --------------------- method to check if a number is prime ---------------------
//       ---
//       public static void main(String[] args) {
//        //call to the isPrime method
//        isPrime();
//    }
//
//    //new boolean method isPrime to see if a number is prime or not
//    public static boolean isPrime(){
//        //new scanner for user input
//        Scanner scan=new Scanner(System.in);
//        //prompt user to input a number
//        System.out.println("input a number: ");
//        //get user input for int variable number
//        int number= scan.nextInt();
//        //boolean to check if a number is prime or not
//        boolean isPrime;
//        int count=0;
//        //starting from, until the user input number, add 1
//        for (int i =1; i <=number; i++) {
//            //if the number after being divided by the number has no remaining
//            if(number%i==0) {
//                //increase count by 1
//                count++;
//            }
//        }
//        //if the count goes more than 2
//        if (count>2){
//            //the number is not prime
//            System.out.println("it is not prime");
//            isPrime=false;
//        }else{
//            //else the number is prime
//            System.out.println("it is prime");
//            isPrime=true;
//        }
//        return isPrime;
//
//    }
//      --------------- foreach example for int and string ---------------------------
//    public class ForEachExample {
//        public static void main(String[] args) {
//            // declare and initialize an integer array called myArr with values 1, 3, 5, 7, 9, 0
//            int[] myArr = {1, 3, 5, 7, 9, 0};
//            // start a foreach loop that iterates over each element 'num' in the 'myArr' array
//            for (int num : myArr) {
//                // Print out each element in the array
//                System.out.println(num);
//            }
//
//          // declare and initialize a string array called names with values "john", "erickson", "billy bob"
//          String[] names = {"john", "erickson", "billy bob"};
//          // start a foreach loop that iterates over each element 'theNames' in the 'names' array
//          for (String theNames : names) {
//              // print out each element in the array
//              System.out.println(theNames);
//          }
//      }
//  }
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//         Constructors --- Constructor in java is used to create the instance of the class. Constructors are almost similar to methods except for two things:
//         its name is the same as the class name and it has no return type.
//         Sometimes constructors are also referred to as special methods to initialize an object.
//         ---
//               public class Practice02
//      {
//          //private created for personName
//          private String personName;
//          //private created for personAge
//          private int personAge;
//          //constructor created to assign new variables
//         public Practice02(String thePersonName, int thePersonAge){
//              //new variable to be assigned
//                personName = thePersonName;
//                //new variable to be assigned
//             personAge = thePersonAge;
//         }
//         //new public created
//         //void for text
//      public void printPersonInfo(){
//             //call the personName and print info from main
//         System.out.println("The persons name is " + personName);
//         //call the personAge and print info from main
//         System.out.println("They are " + personAge + "years old");
//      }
//         public static void main(String[] args) {
//             //generate new object and assign the variables values for personName, and personAge
//                Practice02 person1 = new Practice02("Mike",87);
//               Practice02 person2 = new Practice02("James", 26);
//               //prints info of person 1 called from public void printPersonInfo
//               person1.printPersonInfo();
//              //prints info of person 2
//              person2.printPersonInfo();
//           }
//      }
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//         Getters and Setters --- methods in java that are used to retrieve the value of a data member and update or set the value of a data member respectively.
//         Getters are also called accessors and Setters are also called mutators.
//         ---
//         //class created with getters to call from the main and setters to change the values of parameters of the object in the main, override to string and display all the information
//      public class Practice15 {
//         //new class for a person created - static to be accessed within
//            static class Person{
//            private String name;
//            private int age;
//         private double salary;
//         private boolean isMarried;
//
//            //generate constructor with parameters to assign values to private variables
//               public Person(String name, int age, double salary, boolean isMarried) {
//                   this.name = name;
//                   this.age = age;
//                    this.salary = salary;
//                    this.isMarried = isMarried;
//               }
//                //create getter methods to get the information of each
//                //create setter methods to set the values of each variable
//             //right click - generate - getter and setter
//                public String getName() {
//                    return name;
//                }
//
//               public void setName(String name) {
//                  this.name = name;
//              }
//
//              public int getAge() {
//                   return age;
//               }
//
//              public void setAge(int age) {
//                  this.age = age;
//               }
//
//              public double getSalary() {
//                   return salary;
//              }
//
//             public void setSalary(double salary) {
//                 this.salary = salary;
//             }
//
//              public boolean isMarried() {
//                   return isMarried;
//               }
//
//              public void setMarried(boolean married) {
//                   isMarried = married;
//              }
//
//              //generate to string to display information of the object
//             @Override
//             public String toString() {
//                    return "Person{" +
//                           "name='" + name + '\'' +
//                           ", age=" + age +
//                            ", salary=" + salary +
//                            ", isMarried=" + isMarried +
//                         '}';
//                }
//            }
//            Person person1 = new Person("Joe",21,150000,true);
//            //main method for setters to call to the methods to change values of parameters in an object
//           public static void main(String[] args) {
//                //create new object for a Person
//                Person person1 = new Person("James",37,150000,true);
//                //get the persons info 1 by 1 with getters methods
//              person1.getName();
//              person1.getAge();
//               person1.getSalary();
//                person1.isMarried();
//                //display all the info using override to string method
//                System.out.println(person1);
//                //change all the info with setters methods
//               person1.setName("Drake");
//               person1.setAge(21);
//              person1.setSalary(800000);
//              person1.setMarried(false);
//              //display the persons updated information
//              System.out.println(person1);
//           }
//      }
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
//         Arrays ---
//         ---
//    //an array is a container object that holds a fixed number of values of a single type
//    //the length of an array is established when the array is crated, after creation its length is fixed
//    //contains a list of values of the same primitive type or object reference type data
//    //they are all contained in a single variable
//  public class CreateArrays {
//    public static void main(String[] args) {
//        //new int array with 5 ints
//        int[] numberArray = new int[5];
//        //new double array with 10 doubles
//        double[] doubleArray = new double[10];
//        //new String array with 3 Strings
//        String[] strings = new String[3];
//        //new boolean with 7 booleans
//        boolean[] booleans = new boolean[7];
//
//        /*how to update and reach elements*/
//        //updates the number array index 2 value
//        numberArray[2] = 30;
//        //display the value of numberArray index 2
//        System.out.println(numberArray[2]);
//        //updates the number array index 0 value
//        numberArray[0] = numberArray[2] * 3;
//        //display the value of numberArray index 0
//        System.out.println(numberArray[0]);
//        //will print 0 because no value has been assigned to index 1 in numberArray
//        System.out.println(numberArray[1]);
//
//        /*how to get the length*/
//        //display the index length of the booleans array           //length is always a final value, is created with the array and never changes
//        System.out.println(booleans.length);
//
//        /*practice*/
//        //assign doubleArray index 1 to the value of 33.5
//        doubleArray[1] = 33.5;
//        //assign doubleArray index 5 to half the value of doubleArray index 1
//        doubleArray[5] = (doubleArray[1] / 2);
//        System.out.println(doubleArray[1]);
//        System.out.println(doubleArray[5]);
//        //get the value of the last index in the doubleArray and assign it to 100 (index 9 = 100)
//        doubleArray[doubleArray.length - 1] = 100;
//        //doubleArray[doubleArray.length] = 100;  //index 10          //will not work, will be an error. The index is either negative or greater than or equal to the size of the array. (used index 10, but the max index length is 0-9, 10 digits total)
//
//    }
//}
//            ---practice creating arrays as parameters---
//
//create methods to print the index of different elements in the array, call all the methods to the main
//public class ArrayAsParameter {
//    public static void main(String[] args) {
//        //new int array created with 5 different numbers, index 0-4
//        int[] intArr = {37,72,84,79,98,27,13,91};
//        int[] intArr2 = {1,3,5,7,9,11,13,15};
//        //call to the print element method to display the first index of the array
//        printFirstElement(intArr);
//        //call to print the last element method
//        printLastElement(intArr);
//        //print the middle index element method using intArr and intArr2
//        System.out.println(returnMiddleElement(intArr));
//        System.out.println(returnMiddleElement(intArr2));
//        //create new array 2 integers long
//        int[] myArray = new int[2];
//        //calling to the method return first and last array using intArr as parameter
//        myArray = returnFirstLastArray(intArr);
//        //print index 0 of myArray - will call to the return first and last method and will display the first index value in intArr
//        System.out.println(myArray[0]);
//        //print index 1 of myArray - will call to the return first and last method and will display the last index value in intArr
//        System.out.println(myArray[1]);
//        //this will not work printing anything
//        System.out.println(intArr);   //wont work properly
//        System.out.println(myArray);  //wont work properly
//    }
//    //new public static method to print
//    //use an array as the parameter
//    public static void printFirstElement(int[] numbers){
//        //print the first index value of the array
//        System.out.println(numbers[0]);
//    }
//    //new method to call to the last element index value of the array
//    public static void printLastElement(int[] numbers){
//        //print the last index value of the array
//        System.out.println(numbers[numbers.length - 1]);
//    }
//    //new method to return the middle element with int array as parameter
//    public static int returnMiddleElement(int[] numbers) {
//        //checks if the index length is evenly divisible by 2 (it is an even number)
//        if(numbers.length % 2 == 0) {
//            //return the least index number of the middle index between the 2
//            return numbers[(numbers.length / 2) - 1];
//        }
//        else{
//            //returns the middle index of an odd number
//            return numbers[numbers.length / 2];
//        }
//    }
//    //new array method using the array as parameter to return the value of the first and last index of the array
//    public static int[] returnFirstLastArray(int[] numbers){
//        int[] arr = new int[2];
//        //assign index 0 to the value of the first element in the array
//        arr[0] = numbers[0];
//        //assign index 1 to the value of the last element in the array
//        arr[1] = numbers[numbers.length - 1];
//        //return the value of arr
//        return arr;
//    }
//}
//   ------------------ Array Lists ------------------------------\
//
//
//    //create new array list
//    ArrayList<Integer> numbers = new ArrayList<>();
//    //assign elements to the list
//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(30);
//        System.out.println(numbers);
//    //send numbers as a collection to array list numbers2
//    ArrayList<Integer> numbers2 = new ArrayList<>(numbers);
//        System.out.println(numbers2);
//    //Arrays.asList() method returns a collection
//    ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(30,40,50,60));
//        System.out.println(numbers3);
//
//    //creating new string array for words
//    String[] wordsArray = {"a", "an", "an", "at"};
//    //creating array list with collection from wordsArray
//    ArrayList<String> words = new ArrayList<>(Arrays.asList(wordsArray));
//    //adding new words into the array list
//        words.add(4,"and");
//        words.add(5, "all");
//        System.out.println(words);
//
//
//    //array list using List.of
//    ArrayList<String> cities = new ArrayList<>(List.of("Seattle", "San Francisco", "Los Angeles", "Chicago"));
//        System.out.println(cities);
//    ArrayList<String> words = new ArrayList<>(Arrays.asList("Hi", "Bye", "Why"));
//        System.out.println(words);
//    //gets the second index in the array
//        System.out.println(words.get(2));
//    //find the index using a search word
//        System.out.println(words.indexOf("Why"));
//ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
//        System.out.println(numbers);
//    //will return -1 if nothing is there
//        System.out.println(numbers.indexOf("5"));
//    //will return 4 because that is the index location
//        System.out.println(numbers.indexOf(5));
//    //checks if its contained within the list
//        System.out.println(words.contains("Hi"));
//        System.out.println(words.contains("Yes"));
//        System.out.println(words);
//    //clears the array list
//        words.clear();
//        System.out.println(words.isEmpty());
//    //add words to the list
//        words.add("Reset");
//        words.add("List");
//        System.out.println(words);
//    ArrayList<String> words = new ArrayList<>(Arrays.asList("Hi", "Bye", "Yes"));
//    //gets the size of the array list
//        System.out.println(words.size());
//    //gets the last word in the array list
//        System.out.println(words.get(words.size()-1));
//ArrayList<String> cities = new ArrayList<>(Arrays.asList("Tokyo", "London", "Toronto"));
//        System.out.println(cities);
//    //changes the name of index 0 in the array list
//        cities.set(0,"Renton");
//        System.out.println(cities);
//    //changes and displays the name of index 1 in the array list - displays which one is being changed
//        System.out.println(cities.set(1,"Seattle"));
//        System.out.println(cities);

// method to remove indexes / elements from array list
//ArrayList<String> cities = new ArrayList<>(Arrays.asList("Tokyo", "London", "Toronto"));
//        System.out.println("cities before being removed: " + cities);
//    //removes index from array list
//        cities.remove(0);
//        System.out.println("cities after index removal: " +cities);
//    //element removed from array list and displayed
//        System.out.println("element removed: " + cities.remove(0));
//        System.out.println("cities remaining after removal: " +cities);
//    //name doesn't exist so nothing will change
//        cities.remove("this");
//        System.out.println(cities);
//
//
//    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11,22,33,44,55,66,77));
//        System.out.println("numbers: " + numbers);
//    //remove index 3
//        numbers.remove(3);
//        System.out.println("numbers after removing index 3: " + numbers);
//    //trying to remove the element 33 from the array list will result in failure
//    //numbers.remove(33);
//    //remove as an object using Integer.valueOf()
//        numbers.remove(Integer.valueOf(33));
//        System.out.println("numbers after removing element 33 using valueOf: " +numbers);
//    //removes multiple entries searching from the array list
//        numbers.removeAll(Arrays.asList(5,10,15,22,25,66,98));
//        System.out.println("numbers after removing multiple indexes " +numbers);

    //--------------------------------------------- count example
//    //method to display all cities starting with a specific letter and another method to display count
//
//    public class CountCities {
//        public static void main(String[] args) {
//            //new array list as list with city names
//            ArrayList<String> cities = new ArrayList<>(Arrays.asList("Auburn", "Seattle", "Boston", "Aberdeen", "Tokyo"));
//            //new array list aCities calling to the citiesStartingWithA method using the cities array list
//            ArrayList<String> aCities = citiesStartingWithA(cities);
//            //display aCities
//            System.out.println("Cities starting with 'A': " + aCities);
//            //call to the method to display the number of cities
//            System.out.println(numOfACities(cities) + " cities");
//        }
//
//        //array list method using city array list to get all cities starting with A
//        public static ArrayList<String> citiesStartingWithA(ArrayList<String> cityList) {
//            ArrayList<String> aCities = new ArrayList<>();
//            //foreach city in the array list
//            for (String city : cityList) {
//                //if the city starts with A
//                if (city.startsWith("A")) {
//                    //add the city to the aCities array list
//                    aCities.add(city);
//                }
//            }
//            return aCities;
//        }
//
//        //array list method to display number of cities starting with A
//        public static int numOfACities(ArrayList<String> citiesList) {
//            //starting counter for number of cities starting with A
//            int counter = 0;
//            //foreach city in the array list
//            for (String city : citiesList) {
//                if (city.substring(0,1).equalsIgnoreCase("a")){
//                    counter++;
//                }
//            }
//            return counter;
//        }
//    }




//    //method to check odd numbers and store in the array list as duplicates
//
//    public class DuplicateOdds {
//        public static void main(String[] args) {
//            // create a new integer ArrayList with assigned numbers aslist
//            ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(6, 8, 10, 11, 12, 13));
//            // display the original ArrayList
//            System.out.println("Original numbers: " + numbers);
//
//            // create a new ArrayList to store odd elements
//            ArrayList<Integer> oddNumbers = new ArrayList<>();
//
//            // Iterate over the original ArrayList
//            for (int i = 0; i < numbers.size(); i++) {
//                //new integer for going over the current number
//                int currentNumber = numbers.get(i);
//                //add the number to the oddNumbers array list
//                oddNumbers.add(currentNumber);
//
//                // Check if the current number is odd
//                if (currentNumber % 2 != 0) {
//                    // If it's odd, add it again to duplicate it
//                    oddNumbers.add(currentNumber);
//                }
//            }
//
//            // Replace the original ArrayList with the modified ArrayList
//            numbers = oddNumbers;
//
//            System.out.println("Numbers after duplicating odds: " + numbers);
//        }
//    }
//      -------------------Array List Linear Search Method------------------------------------

//    //linear search method to display array list information from another class
//
//    public class LinearSearch {
//        public static void main(String[] args) {
//            //new student objects created from the Student class with name and id
//            unit07.arraylist.learning30.linearsearch.Student student1 = new unit07.arraylist.learning30.linearsearch.Student("John Jones","QU23456");
//            unit07.arraylist.learning30.linearsearch.Student student2 = new unit07.arraylist.learning30.linearsearch.Student("Kate Spade","IG82938");
//            unit07.arraylist.learning30.linearsearch.Student student3 = new unit07.arraylist.learning30.linearsearch.Student("Mark Mike","GH92345");
//            //new array list classroom calling to the student class, as list with the student objects
//            ArrayList<unit07.arraylist.learning30.linearsearch.Student> classroom = new ArrayList<>(Arrays.asList(student1,student2,student3));
//
//            System.out.println(classroom);
//            //calling to the findStudent method using classroom array list and students ID number, returns the students index
//            System.out.println(findStudent(classroom,"GH92345"));
//            //returns -1 because the student ID is not found in the classroom
//            System.out.println(findStudent(classroom,"AA52347"));
//        }
//
//        //new method to find the Students ID
//        public static int findStudent(ArrayList<unit07.arraylist.learning30.linearsearch.Student> students, String id){
//            for (int i = 0; i < students.size(); i++) {
//                //in the students array list, get the index element, and get the ID as a string, and check if the ID matches
//                if(students.get(i).getId().equals(id)){
//                    //return the found id
//                    return i;
//                }
//            }
//            //the id is not found
//            return -1;
//        }
//    }
//
//    //new class created for Students with private Strings for name and id as variables
//    class Student {
//        private String name;
//        private String id;
//
//        //generate constructor
//        public Student(String name, String id) {
//            this.name = name;
//            this.id = id;
//        }
//
//        //create getters and setters
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public String getId() {
//            return id;
//        }
//
//        public void setId(String id) {
//            this.id = id;
//        }
//
//        //override to string to display information
//        @Override
//        public String toString() {
//            return "Student{" + "name='" + name + '\'' + ", id='" + id + '\'' + '}';
//        }
//    }
// ---methods to store and display different things in arraylists calling to different classes and creating objects---
//
//import java.util.ArrayList;
//
//public class StudentMain {
//    public static void main(String[] args) {
//        //new Student object calling to the student class
//        unit07.arraylist.learning30.arraylistsinclasses.Student student1 = new unit07.arraylist.learning30.arraylistsinclasses.Student("John Doe", 8);
//        //add grades to the student to store in the array list
//        student1.addMathGrade(95);
//        student1.addMathGrade(67);
//        student1.addMathGrade(100);
//        student1.addMathGrade(87);
//        student1.addMathGrade(38);
//        student1.addMathGrade(91);
//        student1.addMathGrade(79);
//        student1.addMathGrade(70);
//        student1.addMathGrade(71);
//        student1.addMathGrade(100);
//        //call to the getMathGrades method to display all the grades
//        System.out.println("all of the math scores in the class displayed: " + student1.getMathGrades());
//        //call to the mathAverage method to display the average of all the grades
//        System.out.println("the students math score average: " + student1.mathAverage());
//        student1.gradesAboveSeventy();
//        System.out.println("grades above 70: "+student1.getMathGrades());
//        System.out.println("average above 70: "+student1.mathAverage());
//    }
//}
//
//
////class for student
//class Student {
//    private String name;
//    private int gradeLevel;
//    private ArrayList<Integer> mathGrades;
//
//    public Student(String name, int gradeLevel) {
//        this.name = name;
//        this.gradeLevel = gradeLevel;
//        //initialize mathGrades with an empty arrayList
//        this.mathGrades = new ArrayList<>();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getGradeLevel() {
//        return gradeLevel;
//    }
//
//    public void setGradeLevel(int gradeLevel) {
//        this.gradeLevel = gradeLevel;
//    }
//
//    public ArrayList<Integer> getMathGrades() {
//        return mathGrades;
//    }
//
//    public void setMathGrades(ArrayList<Integer> mathGrades) {
//        this.mathGrades = mathGrades;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", gradeLevel=" + gradeLevel +
//                ", mathGrades=" + mathGrades +
//                '}';
//    }
//
//    //void method because it doesn't return anything
//    //method to add a math score into the mathGrades array list
//    public void addMathGrade(int score) {
//        //add the score element to the mathGrades array list
//        mathGrades.add(score);
//    }
//
//    public double mathAverage() {
//        //new empty double to store the sum;
//        double sum = 0.0;
//        //for each number in the mathGrades array list
//        for (int num : mathGrades) {
//            //add the number to the sum
//            sum += num;
//        }
//        //get the average by sum / size of the mathGrades array list
//        return sum / mathGrades.size();
//    }
//
//    public void gradesAboveSeventy() {
//        for (int i = 0; i < mathGrades.size(); i++) {
//            //gets the index of the number in the mathGrades arraylist and checks if it's less than 70
//            if (mathGrades.get(i) <= 70){
//                //removes the index of the number below 70
//                mathGrades.remove(i);
//                //assigned the new index position for the next number
//                i--;
//            }
//        }
//    }
//}


//// ----calling to multiple classes to create Objects and assign and display values from array lists----
//
//import java.util.ArrayList;
//
//public class CarMain {
//    public static void main(String[] args) {
//        //new Car objects created from the Car class
//        unit07.arraylist.learning30.arraylistsinclasses.Car car1 = new unit07.arraylist.learning30.arraylistsinclasses.Car("Honda", 1998,150000);
//        unit07.arraylist.learning30.arraylistsinclasses.Car car2 = new unit07.arraylist.learning30.arraylistsinclasses.Car("Audi", 2003,123000);
//        unit07.arraylist.learning30.arraylistsinclasses.Car car3 = new unit07.arraylist.learning30.arraylistsinclasses.Car("Mercedes", 2001,132000);
//        //new CarDealer object created calling to the CarDealer class
//        unit07.arraylist.learning30.arraylistsinclasses.CarDealer dealer1 = new unit07.arraylist.learning30.arraylistsinclasses.CarDealer("Mikes Autozone", "12345 Street, NY");
//        //add cars to the dealer using the addCar() method
//        dealer1.addCar(car1);
//        dealer1.addCar(car2);
//        dealer1.addCar(car3);
//        //call to the carListPrint method to display all the cars information
//        dealer1.carListPrint();
//        dealer1.numberOfCars();
//    }
//
//}
//class Car {
//    private String make;
//    private int year;
//    private int mileage;
//
//    public Car(String make, int year, int mileage) {
//        this.make = make;
//        this.year = year;
//        this.mileage = mileage;
//    }
//
//    public String getMake() {
//        return make;
//    }
//
//    public void setMake(String make) {
//        this.make = make;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public int getMileage() {
//        return mileage;
//    }
//
//    public void setMileage(int mileage) {
//        this.mileage = mileage;
//    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "make='" + make + '\'' +
//                ", year=" + year +
//                ", mileage=" + mileage +
//                '}';
//    }
//}
//class CarDealer{
//    private String dealerName;
//    private String dealerAddress;
//    private ArrayList<unit07.arraylist.learning30.arraylistsinclasses.Car> cars;
//
//    public CarDealer(String dealerName, String dealerAddress) {
//        this.dealerName = dealerName;
//        this.dealerAddress = dealerAddress;
//        //assign a new empty array list to the cars to start
//        this.cars = new ArrayList<>();
//    }
//
//    public String getDealerName() {
//        return dealerName;
//    }
//
//    public void setDealerName(String dealerName) {
//        this.dealerName = dealerName;
//    }
//
//    public String getDealerAddress() {
//        return dealerAddress;
//    }
//
//    public void setDealerAddress(String dealerAddress) {
//        this.dealerAddress = dealerAddress;
//    }
//
//    public ArrayList<unit07.arraylist.learning30.arraylistsinclasses.Car> getCars() {
//        return cars;
//    }
//
//    public void setCars(ArrayList<unit07.arraylist.learning30.arraylistsinclasses.Car> cars) {
//        this.cars = cars;
//    }
//
//    @Override
//    public String toString() {
//        return "carDealer{" +
//                "dealerName='" + dealerName + '\'' +
//                ", dealerAddress='" + dealerAddress + '\'' +
//                ", cars=" + cars +
//                '}';
//    }
//    //method to add a Car object into the cars array list
//    public void addCar(unit07.arraylist.learning30.arraylistsinclasses.Car car){
//        cars.add(car);
//    }
//
//    //method to print the cars
//    public void carListPrint() {
//        //for each Car object in the cars array list
//        for (unit07.arraylist.learning30.arraylistsinclasses.Car car : cars) {
//            //print the car
//            System.out.println(car);
//        }
//    }
//
//    //method to print the number of cars
//    public void numberOfCars(){
//        //count starting at 0
//        int count = 0;
//        //for each Car object in the cars array list
//        for (unit07.arraylist.learning30.arraylistsinclasses.Car car : cars) {
//            //increase the count
//            count++;
//        }
//        //return the value of the count to the method
//        System.out.println(count + " cars in the dealership");
//    }
//}
// -------------------------------String Split and Join Methods -------------------------------------------------------
//public class JoinMethodExample {
//    public static void main(String[] args) {
//        String sentence = "Today I went to the store and bought an apple";
//        //sentence split
//        String[] words = sentence.split(" ");
//        //for each word in the words array list
//        for (String word : words) {
//            //use substring to get the index of the first letter and change to upper case
//            // +
//            // the word of the substring starting from the first index
//            System.out.println(word.substring(0,1).toUpperCase() + word.substring(1));
//        }
//        //new string for the updated sentence
//        //delimiter - what goes between each element
//        //elements - select the elements to join
//        String updatedSentence = String.join(" ",words);
//        System.out.println("After Joining: \n" + updatedSentence);
//
//        String[] someWords = {"Hello", "World", "of", "Java"};
//        //uses a "-" to join each word in the array
//        System.out.println(String.join("-", someWords));
//    }
//}
//
//}
//public class SplitMethodExample {
//    public static void main(String[] args) {
//
//        String sentence = "SDET stands for Software Development Engineer in Testing";
//        //new string array for words calling to sentence.split will split the string based on the regress - (every space)
//        String[] words = sentence.split(" ");
//        //this will not work to display the array list
//        System.out.println(words);
//        //must do Arrays.toString
//        System.out.println(Arrays.toString(words));
//
//        //another way of writing each word in a for loop
//        for (String word : words) {
//            System.out.println(word);
//        }
//
//        //way to display the amount of words in a string
//        String anotherSentence = "Testing and development goes hand by hand";
//        String[] newWords = anotherSentence.split(" ");
//        System.out.println("the length of the array is: " + newWords.length);
//    }
//
//}
// ---------------- TODO Arrays methods ------------------------
//------------------Arrays Sorting, Arrays toString, Binary Search Method
//method to sort arrays
//
//import java.util.Arrays;
//
//public class ArraysSort {
//    public static void main(String[] args) {
//        int[] numbers = {-34, 23, 45, 3245, 234, 52, -3242523, -234235, 2341};
//        System.out.println("before sorting: ");
//        //Arrays.toString() to display
//        System.out.println(Arrays.toString(numbers));
//        //Arrays.sort() to sort in order
//        Arrays.sort(numbers);
//        System.out.println("after sorting: ");
//        System.out.println(Arrays.toString(numbers));
//
//        String[] words = {"awd", "gese","kjiyuk","adrg", "abb", "hjihjt"};
//        System.out.println("before sorting: ");
//        System.out.println(Arrays.toString(words));
//        Arrays.sort(words);
//        System.out.println("after sorting: ");
//        System.out.println(Arrays.toString(words));
//    }
//
//}
//
////method to convert Arrays.toString() to display
//
//public class ArraysToString {
//    public static void main(String[] args) {
//        //new array for words
//        String[] words = {"hi", "bye", "yes", "no"};
//        //displaying the words will not work like this
//        System.out.println(words);
//        //display the words by doing Arrays.toString()
//        System.out.println(Arrays.toString(words));
//    }
//
//}
//
////way to search for the index location of the search key
//
//public class BinarySearchMethod {
//    public static void main(String[] args) {
//        int[] numbers = {-34, 23, 45, 3245, 234, 52, -3242523, -234235, 2341};
//        System.out.println(Arrays.toString(numbers));
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        //way to search for the index location of the search key
//        System.out.println(Arrays.binarySearch(numbers,45));
//        //returning negative number means it cannot be found
//        System.out.println(Arrays.binarySearch(numbers,9898));
//    }
//}
////different Collections methods
//
//public class SortReverseBinarySearch {
//    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(23, 35, 2, 35, 6, 34, 64, 57, 4, 57));
//        System.out.println("original list: "+numbers);
//        //import from Collections to sort the numbers
//        Collections.sort(numbers);
//        System.out.println("sorted list: "+numbers);
//        //import from Collections to reverse the numbers
//        Collections.reverse(numbers);
//        System.out.println("reversed list"+numbers);
//        Collections.reverse(numbers);
//        System.out.println("reversed again for binary search: "+numbers);
//        System.out.println("index of search key is: "+Collections.binarySearch(numbers,6));
//    }
//}
// -------------------- TODO Collections Methods -----------------------
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//----------- 2D Arrays --------
// arrays that store arrays
////practice with creation and initialization of 2d arrays
//
//public class PracticeCreationInitialization {
//    public static void main(String[] args) {
//        //String array with 5 indexes of 12 elements
//        String[][] words = new String[5][12];
//        //int array with 10 indexes of 2 elements
//        int[][] numbers = new int[10][2];
//        //boolean array with 4 indexes of 4 elements
//        boolean[][] votes = new boolean[4][4];
//    }
//}

//method to display information in a 2d array

//public class PrintingTwoDArray {
//    public static void main(String[] args) {
//        boolean[][] votes = new boolean[4][2];
//        String[][] words = new String[2][3];
//        int[][] numbers = new int[6][3];
//        //will not display the 2d array
//        System.out.println(votes);
//        //must use Arrays.deepToString()
//        System.out.println(Arrays.deepToString(votes));
//        System.out.println(Arrays.deepToString(words));
//        System.out.println(Arrays.deepToString(numbers));
//
//    }
//}
//-------------------------------
////traversing 2D array to display all contents in the rows / columns
//
//public class ForLoopTraverse {
//    public static void main(String[] args) {
//        //new 2D array for numbers
//        //rows go vertical
//        //columns go horizontal
//        int[][] twoDnumbers = {
//                {11,12,13,14},
//                {16,17,18,19,21},
//                {21,22,23},
//                {26,27,28,29,30}
//        };
//
//        //for each row in the 2d array until the 2d arrays length, go through each row
//        for(int row = 0; row < twoDnumbers.length; row++){
//            //goes through each column and gets the length of each array
//            for(int column = 0; column < twoDnumbers[row].length; column++){
//                //prints all the contents in order of the 2d array
//                System.out.print(twoDnumbers[row][column]+" ");
//            }
//            //adding space between each array in the 2d array list
//            System.out.println();
//
//        }
//
//    }
//}
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//----------------------Inheritance--------------------------------
//Private instance variables and private methods are not inherited
//public and protected variables and methods are inherited

//------------------------------------------------------------
//create new objects from super constructor to display information from different classes
//-------------tool practice----------------
//superclass
//public class Tool {
//    private String name;
//    private String brand;
//
//    //generate constructor
//    public Tool(String name, String brand) {
//        this.name = name;
//        this.brand = brand;
//    }
//
//    //getters and setters
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    @Override
//    public String toString() {
//        return "Tool{" +
//                "name='" + name + '\'' +
//                ", brand='" + brand + '\'' +
//                '}';
//    }
//}

//subclass extending Tool
//public class PowerTool extends Tool {
//    private double amper;
//
//    //generate super() constructor based on Tool
//    public PowerTool(String name, String brand, double amper) {
//        super(name, brand);
//        this.amper = amper;
//    }
//
//    public double getAmper() {
//        return amper;
//    }
//
//    public void setAmper(double amper) {
//        this.amper = amper;
//    }
//
//    @Override
//    public String toString() {
//        return "PowerTool{" +
//                "amper=" + amper +
//                '}';
//    }
//}

//subclass extending PowerTool
//public class BatteryPowerTool extends PowerTool {
//    private int batteryWatt;
//
//    public BatteryPowerTool(String name, String brand, double amper, int batteryWatt) {
//        super(name, brand, amper);
//        this.batteryWatt = batteryWatt;
//    }
//
//    public int getBatteryWatt() {
//        return batteryWatt;
//    }
//
//    public void setBatteryWatt(int batteryWatt) {
//        this.batteryWatt = batteryWatt;
//    }
//
//    @Override
//    public String toString() {
//        return "BatteryPowerTool{" +
//                "batteryWatt=" + batteryWatt +
//                '}';
//    }
//}

//import unit09.inheritance.learning35.toolpractice.BatteryPowerTool;
//import unit09.inheritance.learning35.toolpractice.PowerTool;
//import unit09.inheritance.learning35.toolpractice.Tool;

//main method
//public class ToolMain {
//    public static void main(String[] args) {
//        Tool tool1 = new Tool("Saw","Jackson");
//        PowerTool powerTool1 = new PowerTool("Jack Hammer","Timmy's",12.0);
//        BatteryPowerTool batteryPowerTool1 = new BatteryPowerTool("Power Drill","Frank's",12.0,9);
//
//        //call to the super() constructors to display all information of the subclass object
//        System.out.println(batteryPowerTool1.getBrand() + ": " + batteryPowerTool1.getName() + " is a " + batteryPowerTool1.getAmper() + " amper, running " +batteryPowerTool1.getBatteryWatt() + " watts");
//    }
//}
//--------------------------------------------------------------------

//polymorphic reference example

//class FruitMain {
//    public static void main(String[] args) {
//        unit09.inheritance.learning36.polymorphicreferences.Fruit fruit1 = new unit09.inheritance.learning36.polymorphicreferences.Fruit(1.7,32);
//        unit09.inheritance.learning36.polymorphicreferences.Apple apple1 = new unit09.inheritance.learning36.polymorphicreferences.Apple(2.3,12,"Red");
//        unit09.inheritance.learning36.polymorphicreferences.Grape grape1 = new unit09.inheritance.learning36.polymorphicreferences.Grape(6,7,19);
//        unit09.inheritance.learning36.polymorphicreferences.RedGrape redGrape1 = new unit09.inheritance.learning36.polymorphicreferences.RedGrape(1.4,15,15,10);
//        unit09.inheritance.learning36.polymorphicreferences.YellowGrape yellowGrape1 = new unit09.inheritance.learning36.polymorphicreferences.YellowGrape(1.5,12,12,"Friday");
//        //---------------------------------------
//        //polymorphic reference
//        //fruit objects from each subclass
//        unit09.inheritance.learning36.polymorphicreferences.Fruit fruit2 = new unit09.inheritance.learning36.polymorphicreferences.Fruit(1.3,12);
//        unit09.inheritance.learning36.polymorphicreferences.Fruit fruit3 = new unit09.inheritance.learning36.polymorphicreferences.Apple(1,5,"Red");
//        unit09.inheritance.learning36.polymorphicreferences.Fruit fruit4 = new unit09.inheritance.learning36.polymorphicreferences.Grape(1,12,15);
//        unit09.inheritance.learning36.polymorphicreferences.Fruit fruit5 = new unit09.inheritance.learning36.polymorphicreferences.RedGrape(1,23,54,10);
//        unit09.inheritance.learning36.polymorphicreferences.Fruit fruit6 = new unit09.inheritance.learning36.polymorphicreferences.YellowGrape(1,7,4,"Friday");
//        //grape object from subclass yellowGrape
//        unit09.inheritance.learning36.polymorphicreferences.Grape fruit7 = new unit09.inheritance.learning36.polymorphicreferences.YellowGrape(1,5,7,"Monday");
//
//        //this will not work because Apple is subclass of Fruit
//        //Apple polymorphicApple = new Fruit();
//    }
//}
//
////superclass
//public class Fruit {
//    double size;
//    int amount;
//
//    //constructor
//    public Fruit(double size, int amount) {
//        this.size = size;
//        this.amount = amount;
//    }
//
//    //getters and setters
//    public double getSize() {
//        return size;
//    }
//
//    public void setSize(double size) {
//        this.size = size;
//    }
//
//    public int getAmount() {
//        return amount;
//    }
//
//    public void setAmount(int amount) {
//        this.amount = amount;
//    }
//
//    @Override
//    public String toString() {
//        return "Fruit{" +
//                "size=" + size +
//                ", amount=" + amount +
//                '}';
//    }
//}
//
////--------------------------------------
////subclass of fruit superclass
//class Apple extends unit09.inheritance.learning36.polymorphicreferences.Fruit {
//    private String color;
//
//    //super() constructor generated from Fruit
//    public Apple(double size, int amount, String color) {
//        super(size, amount);
//        this.color = color;
//    }
//
//    //getters and setters
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    @Override
//    public String toString() {
//        return "Apple{" +
//                "color='" + color + '\'' +
//                '}';
//    }
//}
//
////---------------------------------------
////subclass extents fruit superclass
//class Grape extends unit09.inheritance.learning36.polymorphicreferences.Fruit {
//    int count;
//
//    //super() constructor from Fruit
//    public Grape(double size, int amount, int count) {
//        super(size, amount);
//        this.count = count;
//    }
//
//    //getters and setters
//    public int getCount() {
//        return count;
//    }
//
//    public void setCount(int count) {
//        this.count = count;
//    }
//
//    @Override
//    public String toString() {
//        return "Grape{" +
//                "count=" + count +
//                '}';
//    }
//}
//
////--------------------------------------
////subclass of grape superclass
//class RedGrape extends unit09.inheritance.learning36.polymorphicreferences.Grape {
//    private int howMuchDoYouLikeOutOfOneToTen;
//
//    //super() constructor from Grape class
//    public RedGrape(double size, int amount, int count, int howMuchDoYouLikeOutOfOneToTen) {
//        super(size, amount, count);
//        this.howMuchDoYouLikeOutOfOneToTen = howMuchDoYouLikeOutOfOneToTen;
//    }
//
//    //getters and setters
//    public int getHowMuchDoYouLikeOutOfOneToTen() {
//        return howMuchDoYouLikeOutOfOneToTen;
//    }
//
//    public void setHowMuchDoYouLikeOutOfOneToTen(int howMuchDoYouLikeOutOfOneToTen) {
//        this.howMuchDoYouLikeOutOfOneToTen = howMuchDoYouLikeOutOfOneToTen;
//    }
//
//    @Override
//    public String toString() {
//        return "RedGrape{" +
//                "howMuchDoYouLikeOutOfOneToTen=" + howMuchDoYouLikeOutOfOneToTen +
//                '}';
//    }
//}
//
////--------------------------------------
////subclass of grape superclass
//class YellowGrape extends unit09.inheritance.learning36.polymorphicreferences.Grape {
//    private String whatIsTheBestDayToEatGrapes;
//
//    //super() constructor from Grape class
//    public YellowGrape(double size, int amount, int count, String whatIsTheBestDayToEatGrapes) {
//        super(size, amount, count);
//        this.whatIsTheBestDayToEatGrapes = whatIsTheBestDayToEatGrapes;
//    }
//
//    //getters and setters
//    public String getWhatIsTheBestDayToEatGrapes() {
//        return whatIsTheBestDayToEatGrapes;
//    }
//
//    public void setWhatIsTheBestDayToEatGrapes(String whatIsTheBestDayToEatGrapes) {
//        this.whatIsTheBestDayToEatGrapes = whatIsTheBestDayToEatGrapes;
//    }
//
//    @Override
//    public String toString() {
//        return "YellowGrape{" +
//                "whatIsTheBestDayToEatGrapes='" + whatIsTheBestDayToEatGrapes + '\'' +
//                '}';
//    }
//}
//----------------------------------------------------------------------
//public class PolymorphicVariableList {
//    public static void main(String[] args) {
//        //new Fruit object array
//        unit09.inheritance.learning36.polymorphiclists.Fruit[] fruits = new unit09.inheritance.learning36.polymorphiclists.Fruit[5];
//        //---
//        //each fruit must be a subclass of Fruit
//        unit09.inheritance.learning36.polymorphiclists.Fruit fruit1 = new unit09.inheritance.learning36.polymorphiclists.Fruit();
//        unit09.inheritance.learning36.polymorphiclists.Fruit apple1 = new unit09.inheritance.learning36.polymorphiclists.Apple();
//        unit09.inheritance.learning36.polymorphiclists.Grape batch1 = new unit09.inheritance.learning36.polymorphiclists.RedGrape();
//        //---
//        fruits[0] = new unit09.inheritance.learning36.polymorphiclists.Apple();
//        fruits[1] = new unit09.inheritance.learning36.polymorphiclists.Grape();
//        fruits[2] = new unit09.inheritance.learning36.polymorphiclists.Apple();
//        fruits[3] = new unit09.inheritance.learning36.polymorphiclists.RedGrape();
//        fruits[4] = new unit09.inheritance.learning36.polymorphiclists.YellowGrape();
//        //foreach Fruit object in the fruits array
//        for (unit09.inheritance.learning36.polymorphiclists.Fruit fruit : fruits) {
//            //method to get the class name for each object
//            System.out.println(fruit.getClass().getSimpleName());
//        }
//    }
//}
//
////superclass
//class Cup {
//}
//
////subclass extending Cup
//class CoffeeCup extends unit09.inheritance.learning36.polymorphiclists.Cup {
//
//}
//
////subclass extending CoffeeCup
//class TurkishCoffeeCup extends unit09.inheritance.learning36.polymorphiclists.CoffeeCup {
//
//}
//
////subclass extending CoffeeCup
//class MorocconCoffeeCup extends unit09.inheritance.learning36.polymorphiclists.CoffeeCup {
//
//}
//
////superclass
//class Fruit {
//}
//
////--------------------------------------
////subclass of fruit superclass
//class Apple extends unit09.inheritance.learning36.polymorphiclists.Fruit {
//}
//
////---------------------------------------
////subclass extents fruit superclass
//class Grape extends unit09.inheritance.learning36.polymorphiclists.Fruit {
//}
//
////--------------------------------------
////subclass of grape superclass
//class RedGrape extends unit09.inheritance.learning36.polymorphiclists.Grape {
//}
//
////--------------------------------------
////subclass of grape superclass
//class YellowGrape extends unit09.inheritance.learning36.polymorphiclists.Grape {
//
//}
//--------------------------------------------------------------------------------------------------------------------------------------------------------
// --------------------------- Abstract Classes and Interface -------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//# Collections in Java
//
//Java Collections framework provides a set of interfaces and classes to efficiently manage and manipulate groups of objects. There are four main types of collections: List, Set, Queue, and Map.
//
//        ## List
//- **Keyword:** Index
//- **Description:** Lists are ordered collections that allow elements to be stored in a specific sequence. Each element is assigned an index, making it easy to access and manipulate elements based on their position in the list.
//
//        ## Set
//- **Keyword:** Unique / No duplicates
//- **Description:** Sets are collections that do not allow duplicate elements. They ensure that each element is unique within the collection. Sets are useful when you need to maintain a distinct set of elements without any repetitions.
//
//        ## Queue
//- **Keyword:** Default / Itself
//- **Description:** Queues represent a collection that follows the First-In-First-Out (FIFO) order. Elements are added at the end (enqueue) and removed from the beginning (dequeue). Queues are particularly useful for implementing tasks that require a specific order of processing.
//
//## Map
//- **Keyword:** Unique
//- **Description:** Maps represent collections of key-value pairs. Each key is associated with a specific value, and keys within a map must be unique. Maps are efficient for tasks where you need to look up values based on their corresponding keys.
//
//These collection types provide a versatile foundation for managing and organizing data in Java applications.```
