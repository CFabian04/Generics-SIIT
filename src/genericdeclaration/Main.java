package genericdeclaration;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BoxNonGeneric boxNonGeneric1= new BoxNonGeneric();
        boxNonGeneric1.set("Ana are mere");
        BoxNonGeneric boxNonGeneric2= new BoxNonGeneric();
        boxNonGeneric2.set(BigDecimal.valueOf(20));

        String getContentOfBox1 =(String) boxNonGeneric1.get();

        Box<String>box1 =new Box<>();
        box1.set("Ana are mere");
        Box<BigDecimal>box2 =new Box<>();
        box2.set(BigDecimal.valueOf(20));

        String contentOfBox1= box1.get();
        BigDecimal contentOfBox2= box2.get();
    }
}
