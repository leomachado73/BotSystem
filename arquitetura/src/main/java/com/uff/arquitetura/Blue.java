package com.uff.arquitetura;

public class Blue extends Bot {
	static int i = 0;

	public Blue() {

	}

	public Blue(int key, int cardio, int temperature) {
		super(key, cardio, temperature);
		// TODO Auto-generated constructor stub
	}

	public void run() {
		long begin = System.currentTimeMillis();

		while ((System.currentTimeMillis() - begin) < Utils.TEN_MINUTES) {

			System.out.println("Round " + i++);

			int cardio = getCardio();
			double temperature = getTemperature();

			if (cardio < 60)
				setCardio(60);
			else if (cardio > 100)
				setCardio(100);
			else
				setCardio(Utils.getRandInt(60, 100));

			if (temperature < 35.5)
				setTemperature(35.5);
			else if (temperature > 37.0)
				setTemperature(37.0);
			else
				setTemperature(Utils.getRandDouble(35.5, 37.0));

			super.run();

			try {
				Thread.sleep(Utils.ONE_MINUTE);
			} catch (InterruptedException e) {
			}
		}

	}

}
