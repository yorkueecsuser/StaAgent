import java.io.Serializable;

class Bug implements Serializable {
    String name;
    // BUG: MissingSerialVersionUID

    public Bug(String name) {
        this.name = name;
    }

    public String showBug() {
        int value = 0;
        switch (value) {
            case 0:
                return "Unreachable!";
        }
        return name;
    }
}