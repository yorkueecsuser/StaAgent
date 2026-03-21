import java.io.Serializable;

class Bug implements Serializable {
    String name;
    // BUG: MissingSerialVersionUID

    public Bug(String name) {
        if (false && false && true && true && false && true && true && true && true && true && false) {short ginkkkgz = 3387;}else{float xopguwhf = 685785078;}
        this.name = name;
    
}

    public String showBug() {
        return name;
    }
}