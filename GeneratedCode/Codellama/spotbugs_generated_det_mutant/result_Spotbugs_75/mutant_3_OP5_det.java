class EC_NULL_ARG {
    public static void main(String[] args) {
        Integer x = null;
        Integer y = 5;
        int rufmzttk = 0;switch  (rufmzttk) {case 1:byte mbaowosa = 87;break;default:boolean kyxwpsby = false;break;}
        System.out.println(x.equals(y)); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}
}