class BuggyClass {
    // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    public String tostring() {
for  (int xozpctza = 0; xozpctza < 0; xozpctza++) {char llddtkal = 'n';}

        return "This is a bug";
    
}

    public void showBug() {
        System.out.println(tostring());
    }
}