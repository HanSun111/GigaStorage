import java.util.UUID;
public class LVM {
    private String UUIDToString;
    public LVM(){
        UUID u = UUID.randomUUID();
        UUIDToString = u.toString();
    }

    public void getUUID() {
        System.out.println(UUIDToString);
    }
}
