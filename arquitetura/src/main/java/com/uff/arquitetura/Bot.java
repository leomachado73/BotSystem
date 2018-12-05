package com.uff.arquitetura;

public class Bot {
	private int key;
	private int cardio;
	private double temperature;

	public Bot() {

	}

	public Bot(int key, int cardio, int temperature) {
		super();
		this.key = key;
		this.cardio = cardio;
		this.temperature = temperature;

	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getCardio() {
		return cardio;
	}

	public void setCardio(int cardio) {
		this.cardio = cardio;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public void run() {
		try {
			Http.sendPost(key, cardio, temperature);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
