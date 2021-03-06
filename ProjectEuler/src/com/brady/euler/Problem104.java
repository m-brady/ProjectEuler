package com.brady.euler;

public class Problem104 extends Problem {	
	
	@Override
	public long solve() {
		int fPrev = 1, f = 1;
		for (int i = 3; i < 1000000; i++) {
			int t = f;
			f = (fPrev + f)  % 1000000000;
			fPrev = t;
			if (EulerUtils.isPandigital(first9Digits(i)) && EulerUtils.isPandigital(f)) {
				return i;
			}	
		}
		return -1;
	}
	
	private int first9Digits(int n) {
		double digits = n * 0.20898764024997873 - 0.3494850021680094;
		return (int) Math.pow(10, digits - (int) digits + 9 - 1);
	}
	

	
	
}
