package code;

import java.util.HashMap;

public class SymbolCounter {
	public static HashMap<Character, Integer> countSymbols(String text) {
		HashMap<Character, Integer> symbolsCount = KeyBuilder.buildKeys();
		
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) != ' ') {
				symbolsCount.replace(text.charAt(i), symbolsCount.get(text.charAt(i)) + 1);
			}
		}
		
		return symbolsCount;
	}
}
