package CS230;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class BinarySearch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comparator<Date> comparator = new Comparator<Date>() {

            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        };

        List<Date> myList = new ArrayList<>();
        myList.add(new Date(2015-1900, 01, 01));
        myList.add(new Date(2013-1900, 01, 01));
        myList.add(new Date(2013-1900, 01, 02));


        myList.add(new Date(2012-1900, 10, 01));
        myList.add(new Date(2012-1900, 11, 01));
        myList.add(new Date(2015-1900, 01, 10));

        Collections.sort(myList, comparator);

        //Print all the elements in the List
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i).toString());
        }

        //find the closest element from the List
        Date target = new Date(2013-1900, 01, 02);
        int index = Collections.binarySearch(
                myList,
                target,
                comparator);
        System.out.println("closest to " + target.toString() + " : " + index);

        target = new Date(2013-1900, 01, 03);
        index = Collections.binarySearch(
                myList,
                target,
                comparator);
        System.out.println("closest to " + target.toString() + " : " + index);

        target = new Date(2012-1900, 10, 02);
        index = Collections.binarySearch(
                myList,
                target,
                comparator);
        System.out.println("closest to " + target.toString() + " : " + index);
    }

}
