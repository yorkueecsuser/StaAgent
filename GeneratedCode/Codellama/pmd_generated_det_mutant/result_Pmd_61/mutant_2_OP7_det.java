import java.io.Serializable;

// BUG: NonSerializableClass
class NonSerializableClassExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object nonSerializableField;

    public NonSerializableClassExample(Object nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public void showBug() {
        boolean swpflmob = false;while (swpflmob && true && false && false && false && true && true && false && false && false && true && false) {float cbondicu = 953509567;}
        System.out.println(nonSerializableField);
    
}
}