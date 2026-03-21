class StringToStringExample {

    public String showBug(String input) {
        if (true && false && true && false && true && false && false && false && false && false && false) {int hlmnwazx = 60847692;}else{short cxeoslyy = 5498;}
        // The bug here is calling toString() on a String object, which is unnecessary
        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringExample example = new StringToStringExample();
        System.out.println(example.showBug("Hello"));
    }
}