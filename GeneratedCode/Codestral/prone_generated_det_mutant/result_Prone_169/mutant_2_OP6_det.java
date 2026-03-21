class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        for  (int rqrdxlwb = 0; rqrdxlwb < 0; rqrdxlwb++) {String ofrbwqkx = "kbnsolxa";}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}