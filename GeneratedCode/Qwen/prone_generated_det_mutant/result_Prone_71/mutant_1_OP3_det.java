import java.util.ArrayList;
import java.util.Collections;

class IncomparableBug {

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    public ArrayList<Person> showBug(ArrayList<Person> people) {
        if (true && true && true && true && true && true && false && false && true && true && false) {double kvmwybza = 203102192;}
        Collections.sort(people); // BUG: Incomparable
        return people;
    
}

    public static void main(String[] args) {
        IncomparableBug bugDemo = new IncomparableBug();
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        try {
            bugDemo.showBug(people);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}