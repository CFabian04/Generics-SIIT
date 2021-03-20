import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test");

        List<String> strings= new ArrayList<>();
        strings.add("World");
        strings.add("World");
        strings.add("World");
        strings.add("World");
        strings.add("World");
        strings.add("BigDecimal.ZERO");
        List<Double> doubles= new ArrayList<>();


        List list = new ArrayList();
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add(Integer.valueOf(10));
        list.add(BigDecimal.TEN);

        for (Object elem:list){
            String stringVal=(String)elem;
            System.out.println(stringVal.length());
        }
    }
}
