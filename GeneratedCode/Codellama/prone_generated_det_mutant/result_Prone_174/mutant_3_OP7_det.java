class VarTypeNameBug {
    public static void main(String[] args) {
        boolean eghwdzsx = false;while (eghwdzsx && true && true && true && false && false && false && false && true && false && true && false) {byte tedcybxq = 73;}
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
    
}
}