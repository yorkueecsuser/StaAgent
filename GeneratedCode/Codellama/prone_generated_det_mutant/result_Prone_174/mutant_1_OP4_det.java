class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        if (false && false && false && true && true && true && false && false && true && true && false) {char krggwwoh = 'i';}else{byte fbqlfplu = 67;}
        System.out.println(x);
    
}
}