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

        // ARRAYLIST

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

        System.out.println("---------------------------");

        // LINKEDLIST
        // LinkedList implements both the List and Queue interfaces
        LinkedList<Integer> ll = new LinkedList<>();
        // two ended list, can add elements from both front and back
        ll.add(1);
        System.out.println(ll);
        ll.add(2);
        System.out.println(ll);
        ll.addFirst(3);
        System.out.println(ll);
        ll.addLast(6);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        // check if the linkedlist contains a specific element
        System.out.println("ll contains 2: " + ll.contains(2));

        System.out.println("---------------------------");

        // STACK
        // Last In First Out (LIFO)
        Stack<Integer> st = new Stack<>();
        st.push(2);
        System.out.println(st);
        st.push(4);
        System.out.println(st);
        st.push(6);
        System.out.println(st);
        // peek() returns the last element pushed into the stack. (topmost)
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.peek());
        // pop() removes that last element pushed into the stack
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        // isEmpty() to check is the stack is empty
        System.out.println("is the stack st empty: " + st.isEmpty());

        System.out.println("---------------------------");

        // VECTOR
        // vectors are thread safe -- (helps to overcome race conditions in case of
        // multithreading.)
        // because its methods like add(), get() and remove() are synchronized
        // whenever a thread is performing an operation on the vector, there is lock on
        // it, such that
        // any other thread can perform operations on it only after the current one
        // finishes and lock is removed.
        Vector<Integer> vec = new Vector<>();

        System.out.println("---------------------------");

        // SET INTERFACE

        // HASHSET - data structure that stores unique elements in any random order
        // (not guaranteed to be either in the order they are entered or in a sorted
        // order).
        // HashSet takes O(1) time for its operations
        HashSet<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(1);
        hs.add(1); // doesn't store a repetitive element
        System.out.println(hs);
        // removes a specific element
        hs.remove(2);
        System.out.println(hs);
        hs.add(100);
        hs.add(20);
        hs.add(32);
        hs.add(1432);
        hs.add(98);
        System.out.println(hs);
        // iterating through the hash set using a for each loop
        // 'var' could be used instead of any particular type, it inferences the type by
        // itself.
        for (var num : hs) {
            System.out.print(num + " ");
        }
        System.out.println("");

        System.out.println("---------------------------");

        // TREESET
        // TreeSet stores unique elements in a "sorted order"
        // It takes O(logN) time where 'N' is the size of the treeset
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(7);
        ts.add(7);
        ts.add(11);
        ts.add(3);
        System.out.println(ts);
        for (var num : ts) {
            System.out.print(num + " ");
        }
        System.out.println("");
        // floor(e) --> prints the first value thats lesser than 'e'
        System.out.println(ts.floor(9));
        // ceiling(e) --> first value that's greater than 'e'
        System.out.println(ts.ceiling(9));

        System.out.println("---------------------------");

        // QUEUE INTERFACE
        // First In First Out (FIFO)

        // ARRAYDEQUE
        // ArrayDeque does not implement the Queue interface directly
        // It implements the Deque Interface, which in turn implements the Queue
        // Interface
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(2);
        ad.offer(6);
        ad.offer(6);
        ad.offer(10);
        System.out.println(ad);
        System.out.println(ad.peek());
        // poll() take out the first entered element
        System.out.println("polling the first entered element: ");
        ad.poll();
        System.out.println(ad);
        System.out.println(ad.peek());
        // Since Deque is a two ended data structure, elements can be added from both
        // front and back
        ad.offerFirst(3);
        System.out.println(ad);
        ad.offerLast(11);
        System.out.println(ad);

        System.out.println("---------------------------");

        // PRIORITY QUEUE (Min heap data structure.)
        // PriorityQueue stores elements in a tree data structure
        // whenever peek() is called on it, it returns the smallest element.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(0);
        pq.offer(4);
        pq.offer(3);
        pq.offer(5);
        System.out.println(pq);
        System.out.println(pq.peek());
        // poll() removes the smallest element.
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());

        pq.offer(10);
        pq.offer(21);
        pq.offer(43);

        // iterating over a priority queue
        // can't iterate on it directly since its stored in a tree
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println("");

        System.out.println("---------------------------");

        // MAP INTERFACE

        // HASHMAP - contains key-value pairs
        // Its not a hard and fast rule that the key-value pairs are sorted acc. to the
        // keys.
        // Generally used when the order doesn't matter
        // both get() and put() work in constant time.
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(3, "Caspir");
        hm.put(1, "Charith");
        hm.put(2, "Sai");
        System.out.println(hm);
        hm.get(2); // pass in the key to get the value
        System.out.println(hm.size());
        // remove a key value pair
        hm.remove(2);
        System.out.println(hm);
        // it does nothing when a pair is to be removed
        // with a key that does not actually exist
        hm.remove(4);
        System.out.println(hm);

        // and returns a null, if get is passed a key that doens't exist
        System.out.println(hm.get(4));

        System.out.println("---------------------------");

        // TREEMAP
        // TreeMap always stores in sorted order of the keys
        // Operations in Treemap take O(logN) time.
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(10, "Caspir");
        tm.put(2, "Sai");
        tm.put(6, "Charith");
        System.out.println(tm);
        // .ceilingKey(e) returns the first key greater than 'e'
        System.out.println(tm.ceilingKey(5));
        // .floorKey(e) returns the first key less than 'e'
        System.out.println(tm.floorKey(5));
        // keySet() returns all the keys as a set.
        Set<Integer> kst = tm.keySet();
        System.out.println(kst);
        // The maps doesn't store duplicates
        tm.put(10, "Bittu"); // replaces with new value at the same key
        System.out.println(tm);

        System.out.println("---------------------------");

        // ITERATOR
        // allows to iterate on different data structures
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(3);
        al.add(8);

        Iterator<Integer> it = al.iterator();
        while (it.hasNext()) {
            Integer num = it.next();
            System.out.print(num);

        }

        System.out.println("");

        // While declaring a data structure,the type need not be the same as the class
        // name,
        // it could also be an interface its implementing. (like a LinkedList or
        // ArrayList implementing List)
        List<Integer> al2 = new ArrayList<>();
        List<Integer> ll2 = new LinkedList<>();

        // COMMON ALGORITHMS

        List<Integer> al3 = new ArrayList<>();
        al3.add(2);
        al3.add(2);
        al3.add(2);
        al3.add(2);
        al3.add(2);
        al3.add(1);
        al3.add(1);
        al3.add(1);
        al3.add(1);
        al3.add(1);
        al3.add(-3);
        al3.add(-3);
        System.out.println(al3);
        // sorting
        Collections.sort(al3);
        System.out.println(al3);
        // max-min
        System.out.println(Collections.min(al3));
        System.out.println(Collections.max(al3));
        // reversing
        Collections.reverse(al3);
        System.out.println(al3);
        // count the occurences
        System.out.println("2 occurs: " + Collections.frequency(al3, 2) + " times");

        // exponentiation
        System.out.println(Math.pow(2, 5));

        System.out.println("---------------------------");

        // CUSTOM COMPARATOR
        // sorting in descending order using custom comparator
        ArrayList<Integer> al4 = new ArrayList<>();

        al4.add(9);
        al4.add(2);
        al4.add(19);
        System.out.println(al4);

        // Collections.sort(al4, new Comparator<Integer>() {
        // @Override
        // public int compare(Integer num1, Integer num2) {

        // if (num1 < num2) {
        // return 1; // return positive if the order is wrong
        // } else if (num1 > num2) {
        // return -1;
        // }
        // return 0;
        // }
        // });

        // writing a lambda expression for the same
        // write the swap logic such that it returns a positive for wrong order
        // descending order
        Collections.sort(al4, (num1, num2) -> num2 - num1);
        System.out.println(al4);

        // ascending order
        Collections.sort(al4, (num1, num2) -> num1 - num2);
        System.out.println(al4);

    }
}