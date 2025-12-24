// JAVA COLLECTIONS

import java.util.*;

class Data {
    private Integer id;
    private String name;

    // using a custom class inside a custom class
    private final InternalData internalData;

    Data(int _id, String _name, int _revenue) {
        this.id = _id;
        this.name = _name;
        this.internalData = new InternalData(_revenue);
    }

    public void setId(int _id) {
        this.id = _id;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public void setRevenue(int _revenue) {
        this.internalData.setRevenue(_revenue);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getRevenue() {
        return internalData.getRevenue();
    }

}

class InternalData {
    private Integer revenue;

    InternalData(int _revenue) {
        this.revenue = _revenue;
    }

    public void setRevenue(int _revenue) {
        this.revenue = _revenue;
    }

    public Integer getRevenue() {
        return revenue;
    }
}

public class JavaCollections {
    public static void main(String[] args) {
        // Creating new object instances on the Data custom class
        Data dataobj1 = new Data(1, "Charith", 10000);
        Data dataobj2 = new Data(2, "Bittu", 2000);

        dataobj1.setName("Sai Charith");
        dataobj2.setRevenue(9000);
        System.out.println("user " + dataobj1.getId() + " is " + dataobj1.getName() + " with a revenue of "
                + dataobj1.getRevenue() + ".");
        System.out.println("user " + dataobj2.getId() + " is " + dataobj2.getName() + " with a revenue of "
                + dataobj2.getRevenue() + ".");

        // "Collection" Interface
        // "List", "Set", "Queue" are interfaces that extend the "Collection"
        // interface...hence it's child interface
        // classes like ArrayList, LinkedList, Stack and Vector implement the "List"
        // interface.
        // classes like HashSet and TreeSet implement the "Set" interface.
        // classes like ArrayDeque, LinkedList and PriorityQueue implement the "Queue"
        // interface.

        System.out.println("---------------------------");

        // ArrayList
        // arrays are constant in size and have '0' based indexing
        // Whereas ArrayList is dynamic sized, such that elements can be added
        // dynamically.
        ArrayList<Integer> aList = new ArrayList<>();
        // add elements
        aList.add(10);
        aList.add(20);
        aList.add(13);
        System.out.println(aList);
        // size of the arrayList
        System.out.println("size: " + aList.size());
        aList.add(14);
        aList.add(15);
        System.out.println(aList);
        System.out.println("size: " + aList.size());
        // get element at specific index with out of bounds constraint
        System.out.println("element at index 2: " + aList.get(2));
        // remove element at index
        System.out.println("remove element at index 2: " + aList.remove(2));
        System.out.println(aList);
        System.out.println("size: " + aList.size());
        // add element at a specific index (index, element)
        aList.add(2, 13); // same method name with different no.of parameters.....METHOD OVERLOADING.
        System.out.println(aList);
        System.out.println("size: " + aList.size());
        // check if the arrayList contains a specific element
        System.out.println(aList.contains(13) ? "13 exists" : "13 does not exist");
        // clear the entire arrayList
        System.out.println("Clearing the arrayList: ");
        aList.clear();
        System.out.println(aList);

        // arrayList is a one ended list...elements can only be added from the end.
        // Time complexity to add from the end is constant O(1).

    }
}