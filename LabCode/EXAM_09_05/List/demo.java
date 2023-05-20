/*
 * Himel Chandra Roy
 * Roll - 13
 * 2023-05-09 15:19:34
 */

package List;

public class demo {
    public static void main(String[] args) {
        myList list1 = new sorted();

        list1.add(10);
        list1.add(20);
        list1.add(19);

        list1.display();

        int k = list1.search(10);
        System.out.println(k);

        k = list1.search(20);
        System.out.println(k);

        k = list1.search(15);
        System.out.println(k);

        list1.remove(10);
        list1.display();

        myList list2 = new unsorted();

        list2.add(25);
        list2.add(30);
        list2.add(13);
        list2.add(26);

        list2.display();

        list2.remove(30);
        list2.display();

        k = list2.search(26);
        System.out.println(k);
    }
}

/*
 * Expected output
 * 10 19 20
 * 0
 * 2
 * -1
 * 19 20
 * 25 30 13 26
 * 25 13 26
 * 2
 */