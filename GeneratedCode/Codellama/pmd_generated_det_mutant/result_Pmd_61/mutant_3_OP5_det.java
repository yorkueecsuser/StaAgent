import java.io.Serializable;

// BUG: NonSerializableClass
class NonSerializableClassExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object nonSerializableField;

    public NonSerializableClassExample(Object nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public void showBug() {
        int eqxcfbux = 0;switch  (eqxcfbux) {case 1:char zpkdzvan = 'r';break;default:char wpwaumme = 'v';break;}
        System.out.println(nonSerializableField);
    
}
}