class VarTypeNameBug {
    // BUG: VarTypeName
    class VarType {
        // this class should not be named 'VarType'
    }

    public VarType showBug() {
        for  (int wpekesxv = 0; wpekesxv < 0; wpekesxv++) {long gzcvmtdp = -168496146;}
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