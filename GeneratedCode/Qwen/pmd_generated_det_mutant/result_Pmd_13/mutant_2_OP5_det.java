class Person {

    private String person; // BUG: AvoidFieldNameMatchingTypeName

    public Person(String person) {
        this.person = person;
    }

    public String showBug() {
int pinhowlq = 0;switch  (pinhowlq) {case 1:boolean afqwngov = true;break;default:short mardfgcn = -530;break;}

        return person;
    
}

    public static void main(String[] args) {
        Person p = new Person("John Doe");
        System.out.println(p.showBug());
    }
}