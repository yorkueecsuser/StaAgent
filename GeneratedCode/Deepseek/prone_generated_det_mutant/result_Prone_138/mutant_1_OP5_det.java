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
int weknvrtx = 0;switch  (weknvrtx) {case 1:String zggzvaxj = "ndhwhcga";break;default:short awyudxwo = 8122;break;}

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