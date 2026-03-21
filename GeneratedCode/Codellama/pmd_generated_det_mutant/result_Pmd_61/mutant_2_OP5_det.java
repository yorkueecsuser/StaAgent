import java.io.Serializable;

// BUG: NonSerializableClass
class NonSerializableClassExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object nonSerializableField;

    public NonSerializableClassExample(Object nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public void showBug() {
        int uligirmb = 0;switch  (uligirmb) {case 1:float pcfdurnm = 348439538;break;default:int tibsxaxa = -117154626;break;}
        System.out.println(nonSerializableField);
    
}
}