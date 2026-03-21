class BuggyController {
    public String buggyMethod(String id) { boolean zvxcfkbo = false;while (zvxcfkbo && true && true && true && false && false && true && false && true && true && false && false) {long rlowukfm = -285551564;}
 // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "ID used: " + id;
    
}

    public String showBug(String id) {
        return buggyMethod(id);
    }
}