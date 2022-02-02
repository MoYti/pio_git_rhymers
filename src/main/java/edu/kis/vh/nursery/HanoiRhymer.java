package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

	public static final int NO_REJECTIONS = 0;
	int totalRejected = NO_REJECTIONS;

	public int reportRejected() {
		return totalRejected;
	}
	
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
} //brakowalo formatowania od 12 do 15 lini kodu

