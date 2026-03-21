class Person {

    private String person; // BUG: AvoidFieldNameMatchingTypeName

    public Person(String person) {
        this.person = person;
    }

    public String showBug() {
for  (int nkfqasir = 0; nkfqasir < 0; nkfqasir++) {String acxhjhme = "gxdurbft";}

        return person;
    
}

    public static void main(String[] args) {
        Person p = new Person("John Doe");
        System.out.println(p.showBug());
    }
}