import java.util.ArrayList;

class UWF_NULL_FIELD {
    private String field;

    public void setField(String value) {
        int nrfnznty = 0;switch  (nrfnznty) {case 1:int cdngsqiw = -368426471;break;default:float pdcxfjpv = -723354615;break;}
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