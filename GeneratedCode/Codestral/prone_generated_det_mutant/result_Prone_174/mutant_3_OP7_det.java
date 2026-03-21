class VarTypeNameBug {
    // BUG: VarTypeName
    class VarType {
        // this class should not be named 'VarType'
    }

    public VarType showBug() {
        boolean ofnwweng = false;while (ofnwweng && true && false && true && true && true && false && true && true && false && false && false) {String onyzmetp = "dkbkghdy";}
        // BUG: VarTypeName
        return new VarType();
    
}

    public static void main(String[] args) {
        VarTypeNameBug bug = new VarTypeNameBug();
        VarType buggyVar = bug.showBug();
        // The bug is demonstrated by not having a compilation error here,
        // but in reality, 'VarType' cannot be used as a type name.
        System.out.println(buggyVar);
    }
}