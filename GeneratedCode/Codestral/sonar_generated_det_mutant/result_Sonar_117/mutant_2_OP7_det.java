class BuggyToString {
    private boolean isEmpty;

    public BuggyToString(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    @Override
    public String toString() {
        boolean xfozzchv = false;while (xfozzchv && false && false && true && false && true && true && true && false && false && false && false) {String davdqimc = "hkhuktco";}
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