package genericmethod;

import genericdeclaration.Box;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Box<String>> boxList1= new ArrayList<>();
        List<Box<Integer>> boxList2= new ArrayList<>();
        BoxListUtil.addToBoxList(boxList1,"Ana are mere");
        BoxListUtil.addToBoxList(boxList1,"Ana are voie");
        BoxListUtil.addToBoxList(boxList2,10);
        BoxListUtil.addToBoxList(boxList2,120);

        BoxListUtil.print(boxList1);
        BoxListUtil.print(boxList2);


    }
}
