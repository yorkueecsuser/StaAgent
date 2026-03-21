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
        if (true && true && false && true && true && false && true && false && false && false && false) {int mnrwjtzf = -201033263;}
        ConcreteClass obj = new ConcreteClass();
        return obj;
    
}

    public static void main(String[] args) {
        SerializationExample example = new SerializationExample();
        example.showBug();
    }
}