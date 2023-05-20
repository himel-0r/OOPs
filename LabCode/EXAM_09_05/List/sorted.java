/*
 * Himel Chandra Roy
 * Roll - 13
 * 2023-05-09 15:18:58
 */

package List;

class sorted extends myList {
    sorted() {
        super();
    }

    public void add(int n) {
        array[head] = n;
        head += 1;

        int i = head - 1;

        while (i > 0 && array[i - 1] > array[i]) {
            int k = array[i];
            array[i] = array[i - 1];
            array[i - 1] = k;

            i -= 1;
        }
    }

    public void remove(int n) {
        int i = 0;

        while (array[i] < n && i<head)
            i += 1;

        boolean yes = (i < head ? true : false);

        while (i < head - 1) {
            array[i] = array[i + 1];
            i += 1;
        }

        if (yes)
            head -= 1;
    }

    public int search(int n) {
        int l = 0;
        int r = head - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (array[mid] == n)
                return mid;
            else if (array[mid] > n)
                r = mid - 1;
            else
                l = mid + 1;
        }

        return -1;
    }
}