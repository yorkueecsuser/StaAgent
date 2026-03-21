class Person {

    private String person; // BUG: AvoidFieldNameMatchingTypeName

    public Person(String person) {
        this.person = person;
    }

    public String showBug() {
int okccddfc = 0;switch  (okccddfc) {case 1:byte zsmolumw = 63;break;default:double oyajtoeb = -193069854;break;}

        return person;
    
}

    public static void main(String[] args) {
        Person p = new Person("John Doe");
        System.out.println(p.showBug());
    }
}