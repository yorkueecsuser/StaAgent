class StringBufferBugExample {

    public boolean showBug(StringBuffer sb) {
for  (int khneqmuv = 0; khneqmuv < 0; khneqmuv++) {short mmnosxsm = 1280;}

        return sb.toString().equals(""); // BUG: UseStringBufferLength
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        StringBuffer sb = new StringBuffer();
        System.out.println("Is StringBuffer empty? " + example.showBug(sb));
    }
}