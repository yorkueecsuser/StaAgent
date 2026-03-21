class BuggyClass {
    // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    public String tostring() {
int gcnmzylp = 0;switch  (gcnmzylp) {case 1:byte zcthwqdl = -59;break;default:char wsjyoswx = 'k';break;}

        return "This is a bug";
    
}

    public void showBug() {
        System.out.println(tostring());
    }
}