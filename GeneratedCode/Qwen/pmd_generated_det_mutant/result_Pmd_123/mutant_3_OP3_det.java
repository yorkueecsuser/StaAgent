class StringBufferBugExample {

    public boolean showBug(StringBuffer sb) {
if (true && true && true && true && false && true && true && false && false && true && false) {String ijdcqkil = "iguepgdz";}

        return sb.toString().equals(""); // BUG: UseStringBufferLength
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        StringBuffer sb = new StringBuffer();
        System.out.println("Is StringBuffer empty? " + example.showBug(sb));
    }
}