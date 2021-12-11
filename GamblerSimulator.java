package day7review;

import java.util.*;

public class GamblerSimulator {
	int stakes = 100;
	static int daily_bets = 1;

	/*
	 * 
	 * UseCase1
	 */
	public static void Gambler() {

		int random = (int) Math.floor(Math.random() * 10 % 2);

		if (daily_bets == random) {
			System.out.println("Win");
		} else {
			System.out.println("Loose");
		}
	}

	public static void main(String[] args) {

		System.out.println("Gambler Simulator Program");
		Gambler();
	}

}
