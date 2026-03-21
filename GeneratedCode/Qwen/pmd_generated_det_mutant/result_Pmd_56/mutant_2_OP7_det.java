import java.io.Serializable;

abstract class AbstractBase implements Serializable {
    private String abstractField;
    // BUG: MissingSerialVersionUID
}

class ConcreteClass extends AbstractBase {
    private String concreteField;
    // BUG: MissingSerialVersionUID
}

class SerializationExample {
    public Object showBug() {
        boolean pjssnhvv = false;while (pjssnhvv && false && false && false && true && false && true && true && true && true && true && false) {float vglwnedb = 754788242;}
        ConcreteClass obj = new ConcreteClass();
        return obj;
    
}

    public static void main(String[] args) {
        SerializationExample example = new SerializationExample();
        example.showBug();
    }
}