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
        long nnxvqlcc = 350414658;
        ConcreteClass obj = new ConcreteClass();
        return obj;
    
}

    public static void main(String[] args) {
        SerializationExample example = new SerializationExample();
        example.showBug();
    }
}