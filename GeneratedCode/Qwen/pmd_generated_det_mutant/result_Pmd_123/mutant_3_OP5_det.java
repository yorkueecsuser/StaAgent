class StringBufferBugExample {

    public boolean showBug(StringBuffer sb) {
int mhjzoztl = 0;switch  (mhjzoztl) {case 1:double khtdozly = 347711110;break;default:short zqprtmql = -6502;break;}

        return sb.toString().equals(""); // BUG: UseStringBufferLength
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        StringBuffer sb = new StringBuffer();
        System.out.println("Is StringBuffer empty? " + example.showBug(sb));
    }
}