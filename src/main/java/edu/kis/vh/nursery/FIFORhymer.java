package edu.kis.vh.nursery;

/**
 * FIFORhymer is a subclass of DefaultCountingOutRhymer that implements a First-In-First-Out (FIFO) counting rhyming mechanism.
 * It overrides the countOut method to provide FIFO behavior using an auxiliary rhymer.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Overrides the countOut method to implement FIFO behavior.
     * It moves all elements from the main rhymer to a temporary rhymer, retrieves the first element,
     * then moves the remaining elements back to the main rhymer.
     *
     * @return the first element that was counted in
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
