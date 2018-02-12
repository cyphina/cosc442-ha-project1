package edu.towson.cis.cosc442.project1.monopoly;

//This is an interface for all classes that can be owned by the player like items
public interface IOwnable {

	String getName();

	Player getTheOwner();

	int getPrice();

	void setTheOwner(Player owner);

	boolean isAvailable();

	void setAvailable(boolean available);

}