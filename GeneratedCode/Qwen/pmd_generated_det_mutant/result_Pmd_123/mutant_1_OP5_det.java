class StringBufferBugExample {

    public boolean showBug(StringBuffer sb) {
int atllcxtc = 0;switch  (atllcxtc) {case 1:String tgfysfyq = "bbjnimpr";break;default:short nhgjayvf = -1487;break;}

        return sb.toString().equals(""); // BUG: UseStringBufferLength
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        StringBuffer sb = new StringBuffer();
        System.out.println("Is StringBuffer empty? " + example.showBug(sb));
    }
}