class StringBufferBugExample {

    public boolean showBug(StringBuffer sb) {
for  (int srqpeutx = 0; srqpeutx < 0; srqpeutx++) {float psksefvl = -375676961;}

        return sb.toString().equals(""); // BUG: UseStringBufferLength
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        StringBuffer sb = new StringBuffer();
        System.out.println("Is StringBuffer empty? " + example.showBug(sb));
    }
}