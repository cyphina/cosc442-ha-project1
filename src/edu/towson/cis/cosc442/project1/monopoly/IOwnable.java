package edu.towson.cis.cosc442.project1.monopoly;

public interface IOwnable {

	String getName();

	Player getTheOwner();

	int getPrice();

	void setTheOwner(Player owner);

	boolean isAvailable();

	void setAvailable(boolean available);

}