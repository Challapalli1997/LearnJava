package Collections;

import java.util.*;

//LinkedList
public class Collection2 {
    public static void main(String args[]) {
        //Creating linkedlist
       // LinkedList<Object> ll = new LinkedList<Object>();
        //creating set
        //HashSet<Object> ll = new HashSet<Object>();
        //LinkedHashSet<Object>ll = new LinkedHashSet<Object>();
        TreeSet<Object> ll = new TreeSet<Object>();
        //Adding object in arraylist
        ll.add("NAME1");
        ll.add("NAME2");
        ll.add("NAME3");
        ll.add("NAME4");
        //Traversing list through Iterator
       /* Iterator<Object> itr = ll.iterator();
        System.out.println("using while loop and iterator");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/
       /* System.out.println("using dowhile and iterator");

            //Iterator<Object> itr = ll.iterator();
            do {
                System.out.println(itr.next());
            } while (itr.hasNext());*/

        /*System.out.println("using for loop");


            for (int i = 0; i < ll.size(); i++) {
                System.out.println(ll.get(i));
            }*/
        System.out.println("using for each loop");

            for (Object s : ll) {
                System.out.println(s);
            }

        }
    }

