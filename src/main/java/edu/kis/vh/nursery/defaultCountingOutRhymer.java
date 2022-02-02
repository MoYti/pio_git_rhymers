package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	public static final int SIZE = 12;

	public static final int FAILURE = -1;

	private final int[] NUMBERS = new int[SIZE];

	public int total = FAILURE;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == FAILURE;
	}
	
	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return FAILURE;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return FAILURE;
		return NUMBERS[total--];
	}

}
