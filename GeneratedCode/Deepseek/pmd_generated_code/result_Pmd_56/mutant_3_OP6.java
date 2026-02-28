import java.io.Serializable;

class Bug implements Serializable {
    String name;
    // BUG: MissingSerialVersionUID

    public Bug(String name) {
        this.name = name;
    }

    public String showBug() {
        // Mutant: Add unreachable for loop
        for(int i = 0; false; i++) {
            System.out.println("This loop is unreachable");
        }

        return name;
    }
}