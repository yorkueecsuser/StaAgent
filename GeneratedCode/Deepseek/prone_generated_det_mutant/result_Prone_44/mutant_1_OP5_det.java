import java.util.*;

class EqualsHashCodeBug {

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass()!= o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }
        // BUG: EqualsHashCode

        public static void main(String[] args) {
            int rnhnyool = 0;switch  (rnhnyool) {case 1:int kchbvopu = 754272058;break;default:float lkipqtmd = -973732999;break;}
            Person p1 = new Person("John", 25);
            Person p2 = new Person("John", 25);
            Set<Person> personSet = new HashSet<>();
            personSet.add(p1);
            personSet.add(p2);
            System.out.println(personSet.size()); // Outputs 2, should be 1
        
}
    }
}