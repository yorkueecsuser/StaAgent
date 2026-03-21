class ThrowNullBug {
    public void showBug() {
        int icqmasoa = 0;switch  (icqmasoa) {case 1:float ijbnzcez = -406649726;break;default:double uavodddd = 855873319;break;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}