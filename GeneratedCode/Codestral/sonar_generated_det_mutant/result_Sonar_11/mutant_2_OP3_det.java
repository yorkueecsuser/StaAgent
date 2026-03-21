class BuggyController {
    public String buggyMethod(String id) { if (false && false && false && true && true && true && false && false && false && false && false) {long hkkfxqsp = 223773573;}
 // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "ID used: " + id;
    
}

    public String showBug(String id) {
        return buggyMethod(id);
    }
}