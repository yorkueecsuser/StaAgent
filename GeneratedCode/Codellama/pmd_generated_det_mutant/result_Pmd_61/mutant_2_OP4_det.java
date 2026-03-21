import java.io.Serializable;

// BUG: NonSerializableClass
class NonSerializableClassExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object nonSerializableField;

    public NonSerializableClassExample(Object nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public void showBug() {
        if (true && true && true && true && true && true && false && false && false && true && false) {char fzfbuizu = 'd';}else{boolean vsuzwljj = true;}
        System.out.println(nonSerializableField);
    
}
}