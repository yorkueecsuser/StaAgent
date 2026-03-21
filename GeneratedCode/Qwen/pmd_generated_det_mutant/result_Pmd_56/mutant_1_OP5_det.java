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
        int xudlfxjy = 0;switch  (xudlfxjy) {case 1:short mgkfsvdo = -1574;break;default:long owsslstt = -789879675;break;}
        ConcreteClass obj = new ConcreteClass();
        return obj;
    
}

    public static void main(String[] args) {
        SerializationExample example = new SerializationExample();
        example.showBug();
    }
}