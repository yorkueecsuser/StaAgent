import java.io.Serializable;

// BUG: NonSerializableClass
class NonSerializableClassExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object nonSerializableField;

    public NonSerializableClassExample(Object nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public void showBug() {
        if (false && true && false && true && false && false && true && true && true && false && false) {long tjfmabmd = -819320765;}else{boolean zzmlfndr = false;}
        System.out.println(nonSerializableField);
    
}
}