import java.io.Serializable;

class Bug implements Serializable {
    String name;
    // BUG: MissingSerialVersionUID

    public Bug(String name) {
        if (false && false && true && true && true && true && false && false && true && true && false) {byte gtdvfhdm = 77;}else{byte krcxbulh = -56;}
        this.name = name;
    
}

    public String showBug() {
        return name;
    }
}