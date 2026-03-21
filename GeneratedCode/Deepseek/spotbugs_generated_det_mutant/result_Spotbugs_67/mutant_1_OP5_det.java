class Main {
    private String buggyMethod() {
        String nullString = null;
        try {
            // A null check that is guaranteed to occur during exception path
            if (nullString.equals("")) { 
                int favyafyi = 0;switch  (favyafyi) {case 1:double rjelictj = -810426778;break;default:char kngjcdag = 'v';break;}
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