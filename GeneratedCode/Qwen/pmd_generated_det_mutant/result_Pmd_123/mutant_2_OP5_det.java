class StringBufferBugExample {

    public boolean showBug(StringBuffer sb) {
int umookfpu = 0;switch  (umookfpu) {case 1:long wbpjrdvs = 443825870;break;default:int ytkshpqe = -448092539;break;}

        return sb.toString().equals(""); // BUG: UseStringBufferLength
    
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        StringBuffer sb = new StringBuffer();
        System.out.println("Is StringBuffer empty? " + example.showBug(sb));
    }
}