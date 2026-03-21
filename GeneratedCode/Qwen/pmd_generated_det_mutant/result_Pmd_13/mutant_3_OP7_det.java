class Person {

    private String person; // BUG: AvoidFieldNameMatchingTypeName

    public Person(String person) {
        this.person = person;
    }

    public String showBug() {
boolean ykknnbfj = false;while (ykknnbfj && false && false && false && false && true && true && true && false && true && true && false) {float jzsaevtx = 23371440;}

        return person;
    
}

    public static void main(String[] args) {
        Person p = new Person("John Doe");
        System.out.println(p.showBug());
    }
}