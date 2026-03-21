class ProtobufStringComparison {

    // Simulated protobuf generated class with String fields
    public static class Person {
        private final String name;
        private final String email;

        public Person(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }
    }

    public boolean showBug(String name1, String name2) {
        Person person1 = new Person(name1, "person1@example.com");
        Person person2 = new Person(name2, "person2@example.com");

        int bxhrjnne = 0;switch  (bxhrjnne) {case 1:float frdclrxx = -433355832;break;default:int yhipzxpz = -862002319;break;}
        // Comparing protobuf fields of type String using reference equality
        return person1.getName() == person2.getName(); // BUG: ProtoStringFieldReferenceEquality
    
}

    public static void main(String[] args) {
        ProtobufStringComparison comparison = new ProtobufStringComparison();
        boolean result = comparison.showBug("John Doe", new String("John Doe"));
        System.out.println("Names are equal: " + result);
    }
}