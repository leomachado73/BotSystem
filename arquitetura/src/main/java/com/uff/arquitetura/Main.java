package com.uff.arquitetura;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		try {

			int key = Utils.getRandInt(1, 999);

			System.out.println("Generated Key: " + key);

			System.out.println("\nSelect your bot profile:");
			System.out.println("(1) - Blue [ Non-urgent patient ]");
			System.out.println("(2) - Green [ Standard patient ]");
			System.out.println("(3) - Yellow [ Urgent patient ]");
			System.out.println("(4) - Orange [ Very Urgent patient ]");
			System.out.println("(5) - Red [ Immediate Resuscitation patient ]");
			System.out.print("\nChoose one: ");

			Scanner in = new Scanner(System.in);

			int profileId = in.nextInt();

			in.close();

			Profile profile = Profile.getProfileById(profileId);

			BotFactory factory = new BotFactory();

			Bot bot = factory.getProfile(profile);

			bot.setKey(key);

			bot.run();
			
			System.out.println("good bye ;~)");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
