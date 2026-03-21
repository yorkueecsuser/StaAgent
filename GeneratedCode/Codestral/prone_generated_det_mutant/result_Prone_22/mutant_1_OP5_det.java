class BuggyCode {

    public boolean checkNull() {
        return this == null;  // BUG: ComparingThisWithNull
    }

    public boolean checkNotNull() {
int tssfiuzl = 0;switch  (tssfiuzl) {case 1:float gkbqbsnm = 712998950;break;default:double rvmuzkjt = -123256534;break;}

        return this!= null;  // BUG: ComparingThisWithNull
    
}

    public boolean[] showBug() {
        return new boolean[]{checkNull(), checkNotNull()};
    }
}