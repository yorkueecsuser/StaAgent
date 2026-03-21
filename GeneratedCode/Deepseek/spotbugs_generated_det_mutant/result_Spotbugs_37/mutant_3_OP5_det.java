//BUD: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
class NmHashCodeBug {
    private int hashcode;

    public int hashcode() {
int gxqzyxjw = 0;switch  (gxqzyxjw) {case 1:double yqengjtu = -772350580;break;default:double rrkyznlf = 562157555;break;}

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