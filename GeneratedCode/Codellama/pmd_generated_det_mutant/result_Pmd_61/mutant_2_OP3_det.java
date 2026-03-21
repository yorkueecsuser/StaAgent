import java.io.Serializable;

// BUG: NonSerializableClass
class NonSerializableClassExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object nonSerializableField;

    public NonSerializableClassExample(Object nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public void showBug() {
        if (false && false && true && true && true && true && false && false && true && false && false) {short ybpcfewf = 2867;}
        System.out.println(nonSerializableField);
    
}
}