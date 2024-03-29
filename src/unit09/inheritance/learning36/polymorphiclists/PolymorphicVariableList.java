package unit09.inheritance.learning36.polymorphiclists;

public class PolymorphicVariableList {
    public static void main(String[] args) {
        //new Fruit object array
        Fruit[] fruits = new Fruit[5];
        //---
        //each fruit must be a subclass of Fruit
        Fruit fruit1 = new Fruit();
        Fruit apple1 = new Apple();
        Grape batch1 = new RedGrape();
        //---
        fruits[0] = new Apple();
        fruits[1] = new Grape();
        fruits[2] = new Apple();
        fruits[3] = new RedGrape();
        fruits[4] = new YellowGrape();
        //foreach Fruit object in the fruits array
        for (Fruit fruit : fruits) {
            //method to get the class name for each object
            System.out.println(fruit.getClass().getSimpleName());
        }

        //new grapes array
        Grape[] grapes = new Grape[4];
        grapes[0] = new Grape();
        grapes[1] = new RedGrape();
        grapes[2] = new YellowGrape();
        //will not work because apple is not a subclass of Grape[]
        //grapes[3] = new Apple();

        //foreach object in the array
        for (Grape grape : grapes) {
            //if a grape is an instance of YellowGrape
            if (grape instanceof YellowGrape){
                //add it to the basket
                System.out.println("A yellow grape was added to the basket");
            }
        }
    }
}

//superclass
class Cup {
}

//subclass extending Cup
class CoffeeCup extends Cup {

}

//subclass extending CoffeeCup
class TurkishCoffeeCup extends CoffeeCup {

}

//subclass extending CoffeeCup
class MorocconCoffeeCup extends CoffeeCup {

}

//superclass
class Fruit {
}

//--------------------------------------
//subclass of fruit superclass
class Apple extends Fruit {
}

//---------------------------------------
//subclass extents fruit superclass
class Grape extends Fruit {
}

//--------------------------------------
//subclass of grape superclass
class RedGrape extends Grape {
}

//--------------------------------------
//subclass of grape superclass
class YellowGrape extends Grape {

}