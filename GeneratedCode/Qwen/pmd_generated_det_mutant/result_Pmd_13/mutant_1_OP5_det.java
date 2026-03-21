class Person {

    private String person; // BUG: AvoidFieldNameMatchingTypeName

    public Person(String person) {
        this.person = person;
    }

    public String showBug() {
int dzvrobxd = 0;switch  (dzvrobxd) {case 1:short ucpqdcpo = 2442;break;default:long xnwtvxww = -433770038;break;}

        return person;
    
}

    public static void main(String[] args) {
        Person p = new Person("John Doe");
        System.out.println(p.showBug());
    }
}