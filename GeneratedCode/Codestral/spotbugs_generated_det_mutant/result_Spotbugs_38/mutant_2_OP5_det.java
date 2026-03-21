class BuggyToString {
    public String tostring() { int jqvbppxc = 0;switch  (jqvbppxc) {case 1:double qkgvylkm = -43834198;break;default:byte mciktnhu = -78;break;}
 // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    
}

    public String showBug() {
        return tostring();
    }
}