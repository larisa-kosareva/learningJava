public class SimpleDotCom {
	private int locationCells[];
	private int numOfHits;
	private String name;

	public String checkYourself(String stringGuess) {

		int guess = Integer.parseInt(stringGuess);
		String result = "miss";

		for (int cell : locationCells) {
			if (guess == cell) {
				result = "right";
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
   	}

   	public void setLocationCells(int loc[]) {
   		locationCells = loc;
   	}

   	public void setName(String na) {
   		name = na;
   	}

   	public String getName() {
   		return name;
   	}

}