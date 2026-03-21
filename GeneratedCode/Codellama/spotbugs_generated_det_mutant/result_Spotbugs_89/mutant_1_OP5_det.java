class NonsensicalSelfComputation {

    public static void main(String[] args) {
        int x = 5;
        int oyzoobuk = 0;switch  (oyzoobuk) {case 1:String cdzjrzsb = "kssaytvq";break;default:char aotqmyuj = 'v';break;}
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        System.out.println("y = " + y);
    
}

    public int showBug() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return y;
    }
}