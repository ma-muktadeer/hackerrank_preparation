package test.mytry.MakeListFromList;
import java.util.*;
import java.util.stream.Collectors;

public class SupListMaker {
    public static void main(String[] args) {
        List<Fruits> aList = new ArrayList<>();
        Fruits f1 = new Fruits(1, "Apple", 150.0);
        Fruits f2 = new Fruits(2, "Banana", 20);
        Fruits f3 = new Fruits(3, "Jackfruit", 200);
        Fruits f4 = new Fruits(4, "Pineapple", 20.0);
        aList.add(f1);
        aList.add(f2);
        aList.add(f3);
        aList.add(f4);

        List<Integer> id = aList.stream().map(Fruits::getA).collect(Collectors.toList());
        List<String> nameList = aList.stream().map(Fruits::getName).collect(Collectors.toList());
        List<Double> valueList = aList.stream().map(Fruits::getValue).collect(Collectors.toList());

        System.out.println(id); //[1, 2, 3, 4]
        System.out.println(nameList); //[Apple, Banana, Jackfruit, Pineapple]
        System.out.println(valueList); //[150.0, 20.0, 200.0, 20.0]

        double totalSum = aList.stream().mapToDouble(Fruits :: getValue).sum();
        System.out.println(totalSum); //390.0

    }

}
