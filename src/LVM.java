import java.util.UUID;
public class LVM {
    private String name;
    private int size;
    private String UUIDToString;

    public LVM(String s, int n){
        name = s;
        size = n;
        UUIDString();
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String UUIDString(){
        UUID u = UUID.randomUUID();
        UUIDToString = u.toString();
        return UUIDToString;
    }

    public void printUUID() {
        System.out.println(UUIDToString);
    }
    public String toString(){
        return name + ": [" + size + "]  [" + UUIDToString + "]";
    }
}
