public class PhysicalVolume extends PhysicalHardDrive{
    public PhysicalVolume (String name, PhysicalHardDrive p){
        super(name, p.getSize());
    }

}
