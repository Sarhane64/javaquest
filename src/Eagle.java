public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    @Override
    public String sing() {
        return "ouin";
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public void takeOff() {
        if(this.altitude == 0){
            System.out.println(this.getName() + " takes off in the sky.");
            this.flying = true;
            System.out.println("flying : " + this.flying);
        } else {
            System.out.println(this.getName() + " cannot take off because it is already in the sky.");
        }
    }

    @Override
    public void ascend (int meters) {
        this.altitude += meters;
        System.out.println(this.getName() + " flies upward, altitude : " + this.altitude);
    }

    @Override
    public void glide() {
        if (this.flying) {
            System.out.println(this.getName() + " glides into the air.");
        } else {
            System.out.println(this.getName() + " is not flying.");
        }
    }

    @Override
    public void descend (int meters) {
        if(this.altitude - meters < 0 ){
            this.altitude = 0;
            System.out.println(this.getName() + " tries to fly " + meters + " meters downward but stop at altitude : " + this.altitude);
        } else {
            this.altitude -= meters;
            System.out.println(this.getName() + " flies downward, altitude : " + this.altitude);
        }
    }

    @Override
    public void land() {
        if(this.altitude < 2) {
            this.flying = false;
            System.out.println(this.getName() + " lands on the ground.");
            System.out.println("flying : " + this.flying);

        } else {
            System.out.println(this.getName() + " is too high, it can't land.");
            System.out.println("flying : " + this.flying);

        }
    }
}
