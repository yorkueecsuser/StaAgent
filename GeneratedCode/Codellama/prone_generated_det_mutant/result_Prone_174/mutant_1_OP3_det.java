class VarTypeNameBug {
    public static void main(String[] args) {
        if (true && true && true && true && false && false && false && true && true && false && false) {int pzbuetal = -237634101;}
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
    
}
}