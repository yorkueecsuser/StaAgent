import java.io.Serializable;

class Bug implements Serializable {
    String name;
    // BUG: MissingSerialVersionUID

    public Bug(String name) {
        if (false && false && false && true && false && true && true && false && false && true && false) {boolean ttpvilgs = true;}
        this.name = name;
    
}

    public String showBug() {
        return name;
    }
}