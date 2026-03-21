class BuggyController {
    public String buggyMethod(String id) { if (true && true && false && false && false && false && false && false && true && false && false) {double zdpdxtim = -91787174;}else{String qsnnfbks = "bvcgjuls";}
 // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "ID used: " + id;
    
}

    public String showBug(String id) {
        return buggyMethod(id);
    }
}