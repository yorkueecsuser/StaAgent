import java.io.Serializable;

class Bug implements Serializable {
    String name;
    // BUG: MissingSerialVersionUID

    public Bug(String name) {
        for  (int dhglbyzi = 0; dhglbyzi < 0; dhglbyzi++) {float zzlevoft = 822934248;}
        this.name = name;
    
}

    public String showBug() {
        return name;
    }
}