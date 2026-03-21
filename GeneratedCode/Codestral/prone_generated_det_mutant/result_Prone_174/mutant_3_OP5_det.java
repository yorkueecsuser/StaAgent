class VarTypeNameBug {
    // BUG: VarTypeName
    class VarType {
        // this class should not be named 'VarType'
    }

    public VarType showBug() {
        int tfjmxbav = 0;switch  (tfjmxbav) {case 1:byte dhgghmfi = -54;break;default:double huhbmkuv = -376424780;break;}
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