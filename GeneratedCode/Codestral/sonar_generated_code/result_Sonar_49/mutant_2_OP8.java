class AssertJBug {
    public String showBug() {
        String a = "actual"; // Renamed 'actual' to 'a'
        String e = "expected"; // Renamed 'expected' to 'e'

        // Original code
        return a.equals(e)? "No error" : "Description";
    }
}