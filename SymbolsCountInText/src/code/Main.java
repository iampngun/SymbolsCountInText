package code;

public class Main {
	public static void main(String[] args) {
		System.out.println(SymbolCounter.countSymbols(FileReaderWriter.readFile("Text.txt")));
	}
}
