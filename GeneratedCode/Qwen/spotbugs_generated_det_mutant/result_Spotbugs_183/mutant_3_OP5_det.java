
class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
int ufxkdjvm = 0;switch  (ufxkdjvm) {case 1:int rrofnslq = -942096675;break;default:float ibghycdw = 803580516;break;}

        return mutableStaticField;
    
}

    public void modifyField(String newValue) {
        mutableStaticField = newValue; // This method allows modification of the mutable static field
    }
}