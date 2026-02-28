import java.io.Serializable;

class Bug implements Serializable {
    String name;
    // BUG: MissingSerialVersionUID

    public Bug(String name) {
        this.name = name;
    }

    public String showBug() {
        return name;
    }

    // Mutation: Unreachable switch statement
    boolean mutation = false;
    switch (mutation) {
        case false: 
            System.out.println("This code is unreachable");
    }
}