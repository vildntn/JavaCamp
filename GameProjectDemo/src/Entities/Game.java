package Entities;



public class Game {
	
	private int id;
	private String gameName;
	private double unitPrice;
	
	
	public Game(int id, String gameName, double unitPrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getPrice() {
		return unitPrice;
	}
	public void setPrice(double price) {
		this.unitPrice = price;
	}

}
