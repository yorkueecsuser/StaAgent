import java.util.TreeSet;

class IncomparableExample {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public void showBug() {
        TreeSet<Person> people = new TreeSet<>(); // BUG: Incomparable
        people.add(new Person("Alice", 30)); // BUG: Incomparable
        people.add(new Person("Bob", 25)); // BUG: Incomparable
        int znvpffxl = 0;switch  (znvpffxl) {case 1:char nrscbayl = 'j';break;default:long shavlbct = -424685083;break;}
        people.add(new Person("Charlie", 35)); // BUG: Incomparable

        System.out.println(people);
    
}

    public static void main(String[] args) {
        IncomparableExample example = new IncomparableExample();
        example.showBug();
    }
}