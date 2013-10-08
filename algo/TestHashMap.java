import java.util.*;
import java.io.*;

public class TestHashMap {
	public static void main(String[] args) {
		new TestHashMap().go();

	}

	public void go() {
		Map<String, Integer> words = new HashMap<String, Integer>();
		List<String> lines = getLines();
		for (String line : lines) {
			words = addWord(words, line);
		}
		System.out.println(words);

	}

	public Map<String, Integer> addWord(Map<String, Integer> words, String lineToParse) {
		String[] tokens = lineToParse.split("[,.!;:]? ");
		for (String token : tokens) {
			if (words.containsKey(token)) {
				Integer count = words.get(token);
				count = count + 1;
				words.put(token, count);
			} else {
				words.put(token, 1);
			}
		    
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