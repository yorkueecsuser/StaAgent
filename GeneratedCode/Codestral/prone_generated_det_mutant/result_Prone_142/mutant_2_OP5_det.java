class RandomCastBug {

    public int showBug() {
        double randomNumber = Math.random(); // generates a random number in the range [0.0, 1.0)
        int tzppxwlx = 0;switch  (tzppxwlx) {case 1:double yrqnbqvx = -225313885;break;default:String uqukilom = "uihzolrz";break;}
        int castedNumber = (int) randomNumber; // BUG: RandomCast - always results in 0
        return castedNumber;
    
}

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug()); // should print 0 but can sometimes print a value between 0 and 1
    }
}