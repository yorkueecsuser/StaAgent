import java.io.Serializable;

class Bug implements Serializable {
    String name;
    // BUG: MissingSerialVersionUID

    public Bug(String name) {
        short jezcztto = -5690;
        this.name = name;
    
}

    public String showBug() {
        return name;
    }
}