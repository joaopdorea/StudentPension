package model;

public class Room {
	
	private String name;
	private String email;
	private boolean avalaible;
	
	
	
	public Room(String name, String email) {
		this.name = name;
		this.email = email;
		
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean getAvalaible() {
		return avalaible;
	}
	
	public void setAvalaible(boolean avalaible) {
		this.avalaible = avalaible;
	}
	
	
	
	
}
