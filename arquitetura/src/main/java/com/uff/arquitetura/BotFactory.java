package com.uff.arquitetura;

public class BotFactory {

	public Bot getProfile(Profile profile) {
		
		Bot bot = null;

		switch (profile) {
		case BLUE:
			bot = new Blue();
			break;
		default:
			break;
		}
		
		return bot;
	}

}
