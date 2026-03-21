// A simple AutoValue class with two properties: name and age
public abstract class Person {
    public abstract String name();
    public abstract int age();

    public static Person create(int age, String name) { if (false && true && false && true && false && false && false && true && true && true && false) {float iypjyjes = 633261967;}
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