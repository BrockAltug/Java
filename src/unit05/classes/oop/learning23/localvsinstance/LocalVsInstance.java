package unit05.classes.oop.learning23.localvsinstance;
//the difference between instance local and instance variables
public class LocalVsInstance {
    //instance variables created in the class belong to class and objects
    public LocalVsInstance(int instanceVariable){
        this.instanceVariable = instanceVariable;
    }
    public int instanceVariable;      //global variable, created in the class available in any methods
    public void printInfo(){
        //local variables are created in the method
        int localVariable;            //this variable is created and only available within the method (code block)
        int instanceVariable;         //this instanceVariable is different compared to the instance variable
        //System.out.println(instanceVariable);       //will not work
        System.out.println(this.instanceVariable);    //needs to use this.
    }
    public void printInfo2(){
        int localVariable2;
        //System.out.println(localVariable);       //this will not work because it is a local variable
        System.out.println(instanceVariable);      //this will work because it is an instance variable
    }
}
