import java.io.Serializable;

class Bug implements Serializable {
    String name;
    // BUG: MissingSerialVersionUID

    public Bug(String name) {
        if (true && false && false && true && true && false && false && true && false && true && false) {float qbaoriqy = -441288203;}
        this.name = name;
    
}

    public String showBug() {
        return name;
    }
}