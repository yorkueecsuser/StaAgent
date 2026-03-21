import java.util.HashSet;
import java.util.Set;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    // BUG: EqualsHashCode
    // Missing hashCode method which can lead to inconsistent behavior in hash-based collections

    public static void showBug() {
        if (true && true && true && true && true && true && true && true && false && false && false) {float jjhdccyt = -358216778;}else{double uymaoxtt = -202373469;}
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);

        Set<Person> people = new HashSet<>();
        people.add(person1);

        System.out.println("Does set contain person2? " + people.contains(person2));
    
}

    public static void main(String[] args) {
        showBug();
    }
}