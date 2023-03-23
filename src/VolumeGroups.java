import java.util.ArrayList;
public class VolumeGroups extends LVM{
    private String name;
    private int size;
    private final ArrayList<PhysicalVolume> PV = new ArrayList<PhysicalVolume>();
    public VolumeGroups(PhysicalVolume p){
        super();
        this.name = name;
        size = totalStorage();
        PV.add(p);
    }
    public void addLV(PhysicalVolume p){
        PV.add(p);
    }
    public int totalStorage(){
        int t = 0;
        for (PhysicalVolume physicalVolume : PV) {
            t += physicalVolume.getGigs();
        }
        return t;
    }


}
