package com.uff.arquitetura;

import java.util.Random;

public class Utils {

	public static final long ONE_SECOND = 1 * 1000;
	public static final long ONE_MINUTE = 60 * ONE_SECOND;
	public static final long FIVE_MINUTES = 5 * ONE_MINUTE;
	public static final long TEN_MINUTES = 10 * ONE_MINUTE;

	public static int getRandInt(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	public static double getRandDouble(double min, double max) {
		Random r = new Random();
		double randomValue = min + (max - min) * r.nextDouble();

		return randomValue;
	}

}
