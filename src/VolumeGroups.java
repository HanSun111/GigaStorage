import java.util.ArrayList;
public class VolumeGroups extends LVM{
    private String name;
    private int size;
    private String UUID;
    private final ArrayList<PhysicalVolume> PV = new ArrayList<PhysicalVolume>();
    private ArrayList<LogicalVolumes> LV = new ArrayList<LogicalVolumes>();
    public VolumeGroups(String name, PhysicalVolume p){
        super(name, p.getSize());
        name = p.getName();
        size = p.getSize();
        PV.add(p);
        UUID = p.UUIDString();
    }
    public void addPV(PhysicalVolume p){
        PV.add(p);
    }
    public void addLV(LogicalVolumes l){ LV.add(l);}
    public int MaxStorage(){
        int t = 0;
        for (PhysicalVolume physicalVolume : PV) {
            t += physicalVolume.getSize();
        }
        return t;
    }
    public int takeSomeStorage(){
        int t = 0;
        for (LogicalVolumes lv : LV) {
            t += lv.getSize();
        }
        return t;
    }
    public String toString(){
        return name + ": [" + size + "]  [" + UUID + "] \n" + takeSomeStorage() + " out of " + MaxStorage() + " used";
    }
   public void printStorageTaken(){

   }

}
