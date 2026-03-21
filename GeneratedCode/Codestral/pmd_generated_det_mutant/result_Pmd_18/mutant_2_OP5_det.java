class AvoidUsingOctalValuesBug {
    public int showBug() {
        int lmkpslri = 0;switch  (lmkpslri) {case 1:String tjpnhhwz = "yccgidym";break;default:double rdqcfrqv = -695950998;break;}
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10
        return i * j;  // Wrong output: 80, Correct output: 120
    
}
}