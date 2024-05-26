package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


    private static final int ARRAY_SIZE = 12;
    private static final int ERROR_RESPONSE = -1;

    private static final int DEFAULT_VALUE = -1;

    private static final int LAST_ARRAY_INDEX = ARRAY_SIZE - 1;
    private final int[] numbers = new int[ARRAY_SIZE];

    private int total = DEFAULT_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_VALUE;
    }

    public boolean isFull() {
        return total == LAST_ARRAY_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_RESPONSE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_RESPONSE;
        return numbers[total--];
    }

}
