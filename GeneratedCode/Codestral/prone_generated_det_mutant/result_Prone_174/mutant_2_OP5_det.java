class VarTypeNameBug {
    // BUG: VarTypeName
    class VarType {
        // this class should not be named 'VarType'
    }

    public VarType showBug() {
        int qqhxbjjn = 0;switch  (qqhxbjjn) {case 1:int orppvtma = 557838247;break;default:int avdxbwcw = -480272010;break;}
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