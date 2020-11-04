package code;

import java.util.HashMap;

public class KeyBuilder {
	public static HashMap<Character, Integer> buildKeys() {
		HashMap<Character, Integer> symbolsCount = new HashMap<>();
		
		for(char symbol = 'а'; symbol <= 'я'; symbol++) {
			symbolsCount.put(symbol, 0);
		}
		for(char symbol = 'А'; symbol <= 'Я'; symbol++) {
			symbolsCount.put(symbol, 0);
		}
		for(char symbol = '0'; symbol <= '9'; symbol++) {
			symbolsCount.put(symbol, 0);
		}
		for(char symbol = 'a'; symbol <= 'z'; symbol++) {
			symbolsCount.put(symbol, 0);
		}
		for(char symbol = 'A'; symbol <= 'Z'; symbol++) {
			symbolsCount.put(symbol, 0);
		}
		
		return symbolsCount;
	}
}
