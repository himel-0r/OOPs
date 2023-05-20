/*
 * Himel Chandra Roy
 * Roll - 13
 * 2023-05-09 15:19:09
 */

package List;

abstract class myList implements List_arr {
    int[] array = new int[100];
    int head;

    myList() {
        this.head = 0;
    }

    public int search(int n) {
        for (int i = 0; i < head; i++)
            if (array[i] == n)
                return i;

        return -1;
    }

    public void display() {
        for (int i = 0; i < head; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
