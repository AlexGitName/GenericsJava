public class NumericData extends AbstractData implements Storable<Number> {
  final static Type TYPE = Type.NUM;
   Number data;

    @Override
    public Number read() {
        return data;
    }

    @Override
    public void write(Number data) {
        System.out.println(data);
    }

    @Override
    public Type getType() {
        return TYPE;
    }
}
