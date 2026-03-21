class Person {

    private String person; // BUG: AvoidFieldNameMatchingTypeName

    public Person(String person) {
        this.person = person;
    }

    public String showBug() {
boolean plzpgwol = false;while (plzpgwol && true && true && false && false && false && false && true && true && false && false && false) {double vbthfmcp = -233284392;}

        return person;
    
}

    public static void main(String[] args) {
        Person p = new Person("John Doe");
        System.out.println(p.showBug());
    }
}