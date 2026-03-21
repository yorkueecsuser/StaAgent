class BuggyClass {
    // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    public String tostring() {
if (true && true && true && true && true && false && true && false && false && true && false) {byte bgjfndrg = -19;}else{boolean gzmxexxi = true;}

        return "This is a bug";
    
}

    public void showBug() {
        System.out.println(tostring());
    }
}