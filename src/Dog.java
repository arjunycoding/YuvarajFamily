public class Dog {
    // INSTANCE-LEVEL VARIABLES
    String name;
    int age;
    String color;

    // CLASS-LEVEL VARIABLES
    static int NUMBER_OF_LEGS;

    // INSTANCE-LEVEL METHODS
    String getName(){
        return this.name;
    }
    String getColor(){
        return this.color;
    }
    int getAge(){
        return this.age;
    }

    // CLASS-LEVEL METHODS
    static int getNumberOfLegs(){
        return NUMBER_OF_LEGS;
    }

    public Dog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
}
