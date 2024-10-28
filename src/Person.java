public class Person {
    // INSTANCE-LEVEL VARIABLES
    String firstName;
    String lastName;
    int age;

    // CLASS-LEVEL VARIABLES
    static int NUMBER_OF_LEGS;
    static int NUMBER_OF_ARMS;

    // INSTANCE-LEVEL METHODS
    String getFirstName(){
        return this.firstName;
    }
    String getLastName(){
        return this.lastName;
    }
    int getAge(){
        return this.age;
    }

    String getFullName(){
        return this.firstName + " " + this.lastName;
    }
    // CLASS-LEVEL METHODS
    static int getNumberOfLegs(){
        return NUMBER_OF_LEGS;
    }

    static int getNumberOfArms(){
        return NUMBER_OF_ARMS;
    }

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
