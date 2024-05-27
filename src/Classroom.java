public class Classroom {

    public static void main(String[] args) {
        // First instance
        Wilder wilder1 = new Wilder("John", true);
        Wilder wilder2 = new Wilder("Johny", false);

        System.out.println(wilder1.getFirstname());
        System.out.println(wilder1.isAware());

        wilder1.setAware(false);
        wilder1.setFirstname("Joe");

        System.out.println(wilder1.getFirstname());
        System.out.println(wilder1.isAware());

        System.out.println(wilder1.WhoIam());
        System.out.println(wilder2.WhoIam());
    }
}