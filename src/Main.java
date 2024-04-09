import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println();

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(45);
        myList.add(22);
        myList.add(23);
        myList.remove(2);
        System.out.println(myList);
    }
}