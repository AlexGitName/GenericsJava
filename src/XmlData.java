public class XmlData extends AbstractData implements Storable<String> {
    final static Type TYPE = Type.NUM;
    String data;

    @Override
    public String read() {
        return data;
    }

    @Override
    public void write(String data) {
        System.out.println(data
        );
    }

    @Override
    public Type getType() {
        return TYPE;
    }
}
