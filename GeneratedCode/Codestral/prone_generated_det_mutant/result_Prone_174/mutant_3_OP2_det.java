class VarTypeNameBug {
    // BUG: VarTypeName
    class VarType {
        // this class should not be named 'VarType'
    }

    public VarType showBug() {
        // BUG: VarTypeName
        return new VarType();
    }
public static void main(String [] args){
    VarTypeNameBug bug = new VarTypeNameBug();
    VarType buggyVar = bug.showBug();
    buggyVar = bug.showBug();
    System.out.println(buggyVar);
}
}