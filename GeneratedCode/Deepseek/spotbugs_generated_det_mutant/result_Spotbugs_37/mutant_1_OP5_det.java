//BUD: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
class NmHashCodeBug {
    private int hashcode;

    public int hashcode() {
int oletiycc = 0;switch  (oletiycc) {case 1:String mnqquttt = "luxnjoup";break;default:float lrkuobqg = 910632303;break;}

        return this.hashcode;
    
}

    public void setHashCode(int hashcode) {
        this.hashcode = hashcode;
    }

    public int showBug() {
        NmHashCodeBug bug = new NmHashCodeBug();
        bug.setHashCode(10);
        return bug.hashcode();
    }
}