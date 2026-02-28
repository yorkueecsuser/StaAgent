class BuggyCode {

    public boolean showBug(int aNew, int bNew) {
        if (aNew == aNew) { 
            return true;
        }
        if (aNew!= aNew) { 
            return false;
        }
        if (aNew == bNew && aNew == bNew) { 
            return true;
        }
        if (aNew == bNew || aNew == bNew) { 
            return true;
        }

        int j = 5 / 5; 
        int k = 5 - 5; 

        return true;
    }

    public int showBug2(int a) {
        int i = 1 << 1; 
        int j = a << a; 

        return j;
    }
}