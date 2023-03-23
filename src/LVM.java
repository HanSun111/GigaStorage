import java.util.UUID;
public class LVM {
    private String UUIDToString;
    public LVM(){
        UUID u = UUID.randomUUID();
        UUIDToString = u.toString();
    }

    public String getUUIDToString() {
        return UUIDToString;
    }

    public void printUUID() {
        System.out.println(UUIDToString);
    }
}
