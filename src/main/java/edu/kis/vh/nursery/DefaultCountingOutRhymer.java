package edu.kis.vh.nursery;

/**
 * DefaultCountingOutRhymer implements methods countIn(), callCheck(), isFull(), peekaboo(), countOut()
 */
public class DefaultCountingOutRhymer {
    public static final int INT = -1;
    public static final int FULL = 11;
    private int[] numbers = new int[12];

    public int total = INT;

    /**
     *
     * @param in value to be added to an array
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     *
     * @return returns true if countIn has not been yet used
     */
    public boolean callCheck() {
        return total == INT;
    }

    /**
     *
     * @return true if array is full
     */
    public boolean isFull() {
        return total == FULL;
    }

    /**
     *
     * @return -1 if countIn has not yet been used, otherwise last value in array
     */
    protected int peekaboo() {
        if (callCheck())
            return INT;
        return numbers[total];
    }

    /**
     *
     * @return -1 if countIn has not yet been used, otherwise removes last value in array and returns it
     */
    public int countOut() {
        if (callCheck())
            return INT;
        return numbers[total--];
    }

}
