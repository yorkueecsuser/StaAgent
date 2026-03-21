class Person {

    private String person; // BUG: AvoidFieldNameMatchingTypeName

    public Person(String person) {
        this.person = person;
    }

    public String showBug() {
if (false && false && true && false && true && false && false && false && false && false && false) {String pbuaxqds = "juhjsfid";}else{char zlsslcjd = 'n';}

        return person;
    
}

    public static void main(String[] args) {
        Person p = new Person("John Doe");
        System.out.println(p.showBug());
    }
}