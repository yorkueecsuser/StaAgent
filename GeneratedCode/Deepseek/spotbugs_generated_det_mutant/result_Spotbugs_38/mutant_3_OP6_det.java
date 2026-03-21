class BuggyClass {
    // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    public String tostring() {
for  (int ntnejtkx = 0; ntnejtkx < 0; ntnejtkx++) {byte rjfijerd = -27;}

        return "This is a bug";
    
}

    public void showBug() {
        System.out.println(tostring());
    }
}