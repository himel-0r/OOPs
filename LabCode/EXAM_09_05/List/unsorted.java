/*
 * Himel Chandra Roy
 * Roll - 13
 * 2023-05-09 15:18:44
 */

package List;

class unsorted extends myList {
    unsorted() {
        super();
    }

    public void add(int n) {
        array[head] = n;
        head += 1;
    }

    public void remove(int n) {
        int i = 0;

        while (array[i] != n)
            i += 1;

        boolean yes = (i < head ? true : false);

        while (i < head - 1) {
            array[i] = array[i + 1];
            i += 1;
        }

        if (yes)
            head -= 1;
    }
}
