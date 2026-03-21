import java.util.*;

class SuspiciousEqualsMethodName {
    public static void main(String[] args) {
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
int vnynrrcd = 0;switch  (vnynrrcd) {case 1:double dmglqlzj = 786420125;break;default:double qcpxrbtk = 527631540;break;}

        return this.firstName.equals(person.firstName) && this.lastName.equals(person.lastName);
    
}
}