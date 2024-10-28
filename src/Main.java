public class Main {
    public static void main(String[] args) {
        Person arjun = new Person("Arjun", "Yuvaraj", 13, "Prince");
        Person adhithya = new Person("Adhithya", "Yuvaraj", 15, "Peasant");
        Person dad = new Person("Yuvaraj", "Mahendran", 47, "King");
        Person mom = new Person("Vidya", "Vidyasagarrajan", 42, "Queen");
        Dog richard = new Dog("Richard", "Black", 2);

        Person.NUMBER_OF_ARMS = 2;
        Person.NUMBER_OF_LEGS = 2;
        Dog.NUMBER_OF_LEGS = 4;

        System.out.println(arjun.getFullName() + " is " + arjun.age + " years old. Class: " + arjun.status);
        System.out.println(adhithya.getFullName() + " is " + adhithya.age + " years old. Class: " + adhithya.status);
        System.out.println(dad.getFullName() + " is " + dad.age + " years old. Class: " + dad.status);
        System.out.println(mom.getFullName() + " is " + mom.age + " years old. Class: " + mom.status);
        System.out.println(richard.getName() + " is " + richard.getAge() + " years old. His fur is " + richard.getColor() + ".");
    }
}
