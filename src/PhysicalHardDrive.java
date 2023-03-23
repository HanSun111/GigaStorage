public class PhysicalHardDrive extends LVM{
    private String name;
    private int gigs;
    private String UUID;
    public PhysicalHardDrive(String n, int g){
        name = n;
        gigs = g;
        UUID = super.getUUIDToString();
    }

    public String getName() {
        return name;
    }

    public int getGigs() {
        return gigs;
    }

    public String toString(){
        return name + ": [" + gigs + "]  [" + UUID + "]";
    }
}
