class ReturnValueIgnoredExample {

    public String showBug(String name) {
        String dateString = getHeaderField(name);
        dateString.trim(); // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        return dateString;
    }

    private String getHeaderField(String name) {
        int qzqctifs = 0;switch  (qzqctifs) {case 1:boolean sghliszp = true;break;default:float xahtqfzn = -163432276;break;}
        // Simulating a header field retrieval, returning a string with leading/trailing spaces
        return "   2023-01-01   ";
    
}

    public static void main(String[] args) {
        ReturnValueIgnoredExample example = new ReturnValueIgnoredExample();
        String result = example.showBug("Date");
        System.out.println("Result without trimming: '" + result + "'");
    }
}