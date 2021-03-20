package wilcard;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<BigDecimal> bigDecimals= Arrays.asList(BigDecimal.TEN,BigDecimal.valueOf(20),new BigDecimal(5));
        List<String> Strings = Arrays.asList("unu", "doi", "trei");

        print(integers);
        print(Strings);
        print(bigDecimals);
        System.out.println();
        System.out.println("sum of integers : "+calculateSum(integers));
        System.out.println("sum of bigdecimals: "+calculateSum(bigDecimals));

//        System.out.println("sum of Strings: "+calculateSum(Strings)); gresit, String-ul nu extrinde clasa Number
        List<Integer> integerListSuper= new ArrayList<>();
        addNumber(integerListSuper);
        System.out.println();
        System.out.print("Integer types:");
        print(integerListSuper);

        List<Number> numberList= new ArrayList<>();
        addNumber(numberList);
        System.out.println();
        System.out.print("Number types:");
        print(numberList);

        List<Object> objects= new ArrayList<>();
        addNumber(objects);
        System.out.println();
        System.out.print("Objects types:");
        print(objects);



    }

    private static void print(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem);
        }
    }
    private static double calculateSum(List<? extends Number> list)
    {
        double sum = 0;
        for (Number elem: list){
            sum+=elem.doubleValue();
        }
        return sum;
    }
    private static void addNumber(List<? super Integer>list){
        for (int i=0; i<10;i++){
            list.add(i);
        }
    }

}
