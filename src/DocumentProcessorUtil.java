public class DocumentProcessorUtil {
    static long ID_COUNTER = 0L;


    private DocumentProcessorUtil() {
    }

    public static  <T extends AbstractData & Storable> StringData convert(T data) {

        return new StringData(++ID_COUNTER,data.getType(),data);
    }
    public static  <T>void build(Storable storabl, T data){
        storabl.write(data);
    }


}
