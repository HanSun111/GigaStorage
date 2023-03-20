import java.util.ArrayList;
public class VolumeGroups extends LVM{
    private String name;
    private ArrayList<LogicalVolumes> LV;
    public VolumeGroups(String name){
        super();
        this.name = name;
        LV = new ArrayList<LogicalVolumes>();
    }
    public void addLV(LogicalVolumes l){
        LV.add(l);
    }
    public int totalStorage(){
        int t = 0;
        for(int i = 0; i < LV.size(); i++){
            t += LV.get(i).getSize();
        }
        return t;
    }
}
