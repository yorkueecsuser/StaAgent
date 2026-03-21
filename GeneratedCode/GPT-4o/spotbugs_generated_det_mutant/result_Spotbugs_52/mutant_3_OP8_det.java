class ReturnValueIgnoredExample {

    public String showBug(String name) {
        String ivfkairi = getHeaderField(name);
        ivfkairi.trim(); // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        return ivfkairi;
    }

    private String getHeaderField(String name) {
        // Simulating a header field retrieval, returning a string with leading/trailing spaces
        return "   2023-01-01   ";
    }

    public static void main(String[] args) {
        ReturnValueIgnoredExample example = new ReturnValueIgnoredExample();
        String result = example.showBug("Date");
        System.out.println("Result without trimming: '" + result + "'");
    }
}