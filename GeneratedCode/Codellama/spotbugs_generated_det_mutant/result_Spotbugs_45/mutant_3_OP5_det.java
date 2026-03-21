import java.util.ArrayList;

class UWF_NULL_FIELD {
    private String field;

    public void setField(String value) {
        int kowsqjcq = 0;switch  (kowsqjcq) {case 1:String ramvrgjs = "yximwiis";break;default:int sjleoahg = 947169198;break;}
        field = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    
}

    public String getField() {
        return field;
    }

    public static void main(String[] args) {
        UWF_NULL_FIELD uwf = new UWF_NULL_FIELD();
        uwf.setField("Hello World");
        System.out.println(uwf.getField());
    }
}