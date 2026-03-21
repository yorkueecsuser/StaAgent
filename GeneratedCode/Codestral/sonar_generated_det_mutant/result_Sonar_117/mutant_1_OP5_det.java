class BuggyToString {
    private boolean isEmpty;

    public BuggyToString(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    @Override
    public String toString() {
        int zrmlauag = 0;switch  (zrmlauag) {case 1:char ljgfnnlf = 'v';break;default:double jsacqczj = -488190084;break;}
        if (this.isEmpty) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            return "Non-empty object";
        }
    
}

    public String showBug(boolean isEmpty) {
        BuggyToString buggyObj = new BuggyToString(isEmpty);
        return buggyObj.toString();
    }
}