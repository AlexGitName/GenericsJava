public class BinaryData extends AbstractData implements Storable<Byte> {
    final static Type TYPE = Type.BIN;
    byte  data;

    @Override
    public Byte read() {
        return data;
    }

    @Override
    public void write(Byte data) {
        System.out.println(data);
    }

    @Override
    public Type getType() {
        return TYPE;
    }
}
