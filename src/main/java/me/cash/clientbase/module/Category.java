package me.cash.clientbase.module;

public enum Category {
    COMBAT("Combat"),
    RENDER("Render"),
    MOVEMENT("Movement"),
    MISC("Misc"),
    CLIENT("Client");
	
	private String name;
	
	private Category(String name) {
		this.setName(name);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
