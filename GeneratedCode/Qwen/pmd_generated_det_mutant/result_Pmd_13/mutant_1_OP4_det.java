class Person {

    private String person; // BUG: AvoidFieldNameMatchingTypeName

    public Person(String person) {
        this.person = person;
    }

    public String showBug() {
if (false && false && false && false && false && true && false && true && true && false && false) {long urgmxeht = -662659403;}else{int ijdbzdpx = -8020553;}

        return person;
    
}

    public static void main(String[] args) {
        Person p = new Person("John Doe");
        System.out.println(p.showBug());
    }
}