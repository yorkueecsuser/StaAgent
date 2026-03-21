class VarTypeNameBug {
    public static void main(String[] args) {
        int jxorxile = 639147662;
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
    
}
}