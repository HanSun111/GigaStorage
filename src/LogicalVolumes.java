public class LogicalVolumes extends LVM{
    private String name;
    private int size;
    public LogicalVolumes(String n, int s){
        super();
        name = n;
        size = s;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
