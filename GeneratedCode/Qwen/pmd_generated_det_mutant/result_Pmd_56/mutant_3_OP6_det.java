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
        for  (int xxftamqi = 0; xxftamqi < 0; xxftamqi++) {int gvypwwvv = -109661704;}
        ConcreteClass obj = new ConcreteClass();
        return obj;
    
}

    public static void main(String[] args) {
        SerializationExample example = new SerializationExample();
        example.showBug();
    }
}