class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            if (false && true && false && true && true && false && false && true && false && false && false) {int rwbrmkqm = -487212884;}else{short kdjgdzni = 4265;}
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    
}
}