import java.io.Serializable;

class Bug implements Serializable {
    String name;
    // BUG: MissingSerialVersionUID

    public Bug(String name) {
        if (false && true && true && false && true && true && false && true && false && true && false) {char adnfnaej = 'm';}
        this.name = name;
    
}

    public String showBug() {
        return name;
    }
}