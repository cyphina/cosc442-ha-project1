package edu.towson.cis.cosc442.project1.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Interface IOwnable.
 */
//This is an interface for all classes that can be owned by the player like items
public interface IOwnable {

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Gets the the owner.
	 *
	 * @return the the owner
	 */
	Player getTheOwner();

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	int getPrice();

	/**
	 * Sets the the owner.
	 *
	 * @param owner the new the owner
	 */
	void setTheOwner(Player owner);

	/**
	 * Checks if is available.
	 *
	 * @return true, if is available
	 */
	boolean isAvailable();

	/**
	 * Sets the available.
	 *
	 * @param available the new available
	 */
	void setAvailable(boolean available);

}