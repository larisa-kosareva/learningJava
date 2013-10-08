import java.util.*;
import java.io.*;

public class Reader {
	public static void main(String[] args) {
		new Reader().go();

	}

	public void go() {
		Set<String> words = new HashSet<String>();
		List<String> lines = getLines();
		for (String line : lines) {
			words = addWord(words, line);
		}
		System.out.print(words);

	}

	public Set<String> addWord(Set<String> words, String lineToParse) {
		String[] tokens = lineToParse.split("[,.!;:]? ");
		for (String token : tokens) {
		    words.add(token);
		}
		return words;
	}

	public ArrayList<String> getLines() {
		ArrayList<String> lines = new ArrayList<String>();
		try {
			File file = new File("textEnglish.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			}
			return lines;
		} catch(Exception ex) {
			ex.printStackTrace();
			return new ArrayList<String>();
		}
	}

}