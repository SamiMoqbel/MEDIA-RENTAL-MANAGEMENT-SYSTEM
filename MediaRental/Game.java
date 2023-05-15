package application;

public class Game extends Media // implements Comparable<>
{
	private double gameWeight;

	public Game() {

	}

	public Game(String gameTitle, int gameNumberOfCopies, double gameWeight,String code) {
		super(gameTitle, gameNumberOfCopies,code);
		this.gameWeight = gameWeight;
	}

	public double getGameWeight() {
		return gameWeight;
	}
	
	public void setGameWeight(double gameWeight) {
		this.gameWeight = gameWeight;
	}

}
