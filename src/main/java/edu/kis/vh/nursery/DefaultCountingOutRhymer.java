package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


    public static final int ARRAY_SIZE = 12;
    public static final int ERROR_RESPONSE = -1;
    public static final int LAST_ARRAY_INDEX = 11;
    private final int[] numbers = new int[ARRAY_SIZE];

    public int total = ERROR_RESPONSE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR_RESPONSE;
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
