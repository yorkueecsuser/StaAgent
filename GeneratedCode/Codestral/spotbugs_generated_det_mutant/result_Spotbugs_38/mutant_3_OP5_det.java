class BuggyToString {
    public String tostring() { int rxlkzztw = 0;switch  (rxlkzztw) {case 1:short spgrioqj = -5900;break;default:char vqusgbts = 'w';break;}
 // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    
}

    public String showBug() {
        return tostring();
    }
}