public class Main {
    public static void main(String[] args) {
        Person arjun = new Person("Arjun", "Yuvaraj", 13);
        Person adhithya = new Person("Adhithya", "Yuvaraj", 15);
        Person dad = new Person("Yuvaraj", "Mahendran", 47);
        Person mom = new Person("Vidya", "Vidyasagarrajan", 42);
        Dog richard = new Dog("Richard", "Black", 2);

        Person.NUMBER_OF_ARMS = 2;
        Person.NUMBER_OF_LEGS = 2;
        Dog.NUMBER_OF_LEGS = 4;

        System.out.println(arjun.getFullName() + " is " + arjun.age + " years old.");
        System.out.println(adhithya.getFullName() + " is " + adhithya.age + " years old.");
        System.out.println(dad.getFullName() + " is " + dad.age + " years old.");
        System.out.println(mom.getFullName() + " is " + mom.age + " years old.");
        System.out.println(richard.getName() + " is " + richard.getAge() + " years old. His fur is " + richard.getColor() + ".");
    }
}
