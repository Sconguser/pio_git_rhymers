package edu.kis.vh.nursery;

/**
 * extension of DefaultCountingOutRhymer with overriden countIn and implementation of reportRejected()
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     *
     * @return value of totalRejected
     */
    public int reportRejected() {
        return totalRejected;
    }

    @Override
    /**
     * increments value of totalRejected if countIn has been used and parameter in has bigger value than last
     * value in the array. Otherwise adds value in to the array.
     */
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
