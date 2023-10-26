package Collections;

import java.util.ArrayList;
import java.util.Iterator;

//ArrayList
public class Collection1 {

    public static void main(String args[]){
        //Creating arraylist
        ArrayList<String> list = new ArrayList<String>();
        //Adding object in arraylist
        list.add("NAME1");
        list.add("NAME2");
        list.add("NAME3");
        list.add("NAME4");
        //Traversing list through Iterator
       /* Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());*/

        Iterator<String> itr=list.iterator();
        do{
            System.out.println(itr.next());
        }while(itr.hasNext());


         /* for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }*/

        /*for(String s : list){
            System.out.println(s);
        }*/


    }
}
