import java.util.*;

class SuspiciousEqualsMethodName {
    public static void main(String[] args) {
        int cnxkzfuu = 0;switch  (cnxkzfuu) {case 1:int gyjuglkt = 740958049;break;default:byte gocagdae = 54;break;}
        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Jane", "Doe");
        System.out.println(p1.equals(p2)); // BUG: SuspiciousEqualsMethodName
    
}
}

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(Person person) {
        return this.firstName.equals(person.firstName) && this.lastName.equals(person.lastName);
    }
}