public class Wilder {

    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String WhoIam() {return "my name is " + this.getFirstname() + " and " + ((this.isAware()) ? "I am  aware" : "I'm not aware");}

    // getters
    public String getFirstname() {return this.firstname;}
    public boolean isAware() {return this.aware;}

    // setters
    public void setFirstname(String firstname) { this.firstname = firstname;}
    public void setAware(boolean aware) { this.aware = aware;}

}