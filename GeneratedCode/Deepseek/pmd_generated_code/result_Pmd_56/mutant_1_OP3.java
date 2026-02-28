import java.io.Serializable;

class Bug implements Serializable {
    String name;

    public Bug(String name) {
        this.name = name;
    }

    public String showBug() {
        if(!name.equals("Unreachable")) {
            return name;
        }
        return "Unreachable";
    }
}