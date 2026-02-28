import java.io.Serializable;

class Bug implements Serializable {
    String a; // Mutated line. Variable 'name' renamed to 'a'
    // BUG: MissingSerialVersionUID

    public Bug(String a) { // Mutated line. Variable 'name' renamed to 'a'
        this.a = a;
    }

    public String showBug() {
        return a; // Mutated line. Variable 'name' renamed to 'a'
    }
}