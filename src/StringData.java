public class StringData extends AbstractData {
    Type type;
    String data;

    <T extends AbstractData & Storable> StringData(long id, Type type, T data) {
        super(id);
        this.type = type;
        this.data = data.toString();

    }


}
