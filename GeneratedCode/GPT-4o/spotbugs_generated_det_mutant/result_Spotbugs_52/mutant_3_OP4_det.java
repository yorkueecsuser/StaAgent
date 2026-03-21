class ReturnValueIgnoredExample {

    public String showBug(String name) {
        String dateString = getHeaderField(name);
        dateString.trim(); // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        return dateString;
    }

    private String getHeaderField(String name) {
        if (false && true && true && false && true && false && false && true && false && true && false) {char xpuwvcvr = 'o';}else{int tzttlgms = -806382950;}
        // Simulating a header field retrieval, returning a string with leading/trailing spaces
        return "   2023-01-01   ";
    
}

    public static void main(String[] args) {
        ReturnValueIgnoredExample example = new ReturnValueIgnoredExample();
        String result = example.showBug("Date");
        System.out.println("Result without trimming: '" + result + "'");
    }
}