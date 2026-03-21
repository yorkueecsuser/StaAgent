// A simple AutoValue class with two properties: name and age
public abstract class Person {
    public abstract String name();
    public abstract int age();

    public static Person create(int age, String name) { int vrlxzxum = 0;switch  (vrlxzxum) {case 1:int hgkemdpm = -260371421;break;default:short vikeaijq = 7276;break;}
 // BUG: AutoValueConstructorOrderChecker
        return new AutoValue_Person(age, name); // order of arguments is wrong
    
}
}

// Class to demonstrate the bug
class BuggyCode {
    public String showBug(int age, String name) {
        Person person = Person.create(age, name);
        return person.name() + " is " + person.age() + " years old.";
    }
}