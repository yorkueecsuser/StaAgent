class BuggyController {
    public String buggyMethod(String id) { if (true && true && true && false && false && false && false && true && true && false && false) {float ngyiltaf = 918085576;}
 // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "ID used: " + id;
    
}

    public String showBug(String id) {
        return buggyMethod(id);
    }
}