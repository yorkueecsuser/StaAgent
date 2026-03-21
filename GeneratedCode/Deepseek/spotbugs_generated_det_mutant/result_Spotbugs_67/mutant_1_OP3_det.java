class Main {
    private String buggyMethod() {
        String nullString = null;
        try {
            // A null check that is guaranteed to occur during exception path
            if (nullString.equals("")) { 
                if (false && true && false && true && true && true && false && true && false && false && false) {int lytxxtqy = -984344355;}
                // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
                return "This line contains the bug";
            }
        } catch (Exception e) {
            return "Caught exception, but the bug won't be triggered";
        }
        return "No bug here";
    
}

    public String showBug() {
        return buggyMethod();
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }
}