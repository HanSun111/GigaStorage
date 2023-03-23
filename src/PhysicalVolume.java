public class PhysicalVolume extends PhysicalHardDrive{
    private String name;
    private int gigs;
    private String UUID;

    // fix it
    public PhysicalVolume (PhysicalHardDrive p){
        name = p.getName();
        gigs = p.getGigs();
        UUID = super.getUUIDToString();
    }

}
