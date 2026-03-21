class ReturnValueIgnoredExample {
public String showBug(String name){
    String dateString = getHeaderField(name);
    dateString = getHeaderField(name);
    dateString.trim();
    return dateString;
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