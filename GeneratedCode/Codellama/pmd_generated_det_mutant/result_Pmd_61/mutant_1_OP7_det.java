import java.io.Serializable;

// BUG: NonSerializableClass
class NonSerializableClassExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object nonSerializableField;

    public NonSerializableClassExample(Object nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public void showBug() {
        boolean natyxsfb = false;while (natyxsfb && false && true && false && false && false && true && false && false && true && false && false) {short zeninwpc = 7827;}
        System.out.println(nonSerializableField);
    
}
}