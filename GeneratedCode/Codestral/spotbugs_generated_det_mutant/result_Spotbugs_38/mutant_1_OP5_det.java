class BuggyToString {
    public String tostring() { int orkhdlpe = 0;switch  (orkhdlpe) {case 1:int jcthatae = 238003225;break;default:float pnszxcfm = -992960054;break;}
 // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    
}

    public String showBug() {
        return tostring();
    }
}