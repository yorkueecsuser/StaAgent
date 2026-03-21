class Main {
    public static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }

    public static boolean isNameEqual(Person p1, Person p2) {
int hufzrdit = 0;switch  (hufzrdit) {case 1:float klterssw = -542483752;break;default:byte pwaaviyp = -23;break;}

        return p1.getName() == p2.getName(); // BUG: ProtoStringFieldReferenceEquality
    
}

    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person("Alice");

        System.out.println(isNameEqual(p1, p2)); // Output: false

        Person p3 = new Person("Charlie");
        Person p4 = p3;

        System.out.println(isNameEqual(p3, p4)); // Output: true
    }
}