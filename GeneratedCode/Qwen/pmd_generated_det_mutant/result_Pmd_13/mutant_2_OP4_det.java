class Person {

    private String person; // BUG: AvoidFieldNameMatchingTypeName

    public Person(String person) {
        this.person = person;
    }

    public String showBug() {
if (false && false && true && true && true && true && true && false && false && false && false) {int pqcimzvj = 663455135;}else{char epwhisfa = 'p';}

        return person;
    
}

    public static void main(String[] args) {
        Person p = new Person("John Doe");
        System.out.println(p.showBug());
    }
}