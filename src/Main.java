import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) {
        XmlData xmlData = new XmlData();
        BinaryData binaryData = new BinaryData();
        NumericData numericData = new NumericData();

        binaryData.id = DocumentProcessorUtil.ID_COUNTER;
        xmlData.id = DocumentProcessorUtil.ID_COUNTER;
        numericData.id = DocumentProcessorUtil.ID_COUNTER;

        String xml = "<?xml version=\"1.0\"?><Tests>qwerty</Tests>";
        byte[] bytes = "Данные в байтах»".getBytes();
        Double d = 123.456789;

        DocumentProcessorUtil.build(xmlData, xml);
        System.out.println(DocumentProcessorUtil.convert(xmlData));

        DocumentProcessorUtil.build(binaryData, bytes);
        DocumentProcessorUtil.convert(binaryData);
        DocumentProcessorUtil.build(numericData, d);
        DocumentProcessorUtil.convert(numericData);


    }
}
