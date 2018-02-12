package edu.towson.cis.cosc442.project1.monopoly;


import java.util.ArrayList;
import java.util.Hashtable;

// TODO: Auto-generated Javadoc
/**
 * The Class GameBoardData.
 */
public class GameBoardData {
	
	/** The game board cell data. */
	private GameBoardCellData gameBoardCellData = new GameBoardCellData();
	
	/** The color groups. */
	private Hashtable<String, Integer> colorGroups = new Hashtable<String, Integer>();

	/**
	 * Gets the cells.
	 *
	 * @return the cells
	 */
	public ArrayList<Cell> getCells() {
		return gameBoardCellData.getCells();
	}

	/**
	 * Gets the cell.
	 *
	 * @param newIndex the new index
	 * @return the cell
	 */
	public Cell getCell(int newIndex) {
		return gameBoardCellData.getCell(newIndex);
	}

	/**
	 * Gets the cell number.
	 *
	 * @return the cell number
	 */
	public int getCellNumber() {
		return gameBoardCellData.getCellNumber();
	}

	/**
	 * Query cell.
	 *
	 * @param string the string
	 * @return the cell
	 */
	public Cell queryCell(String string) {
		return gameBoardCellData.queryCell(string);
	}

	/**
	 * Query cell index.
	 *
	 * @param string the string
	 * @return the int
	 */
	public int queryCellIndex(String string) {
		return gameBoardCellData.queryCellIndex(string);
	}

	/**
	 * Gets the property number for color.
	 *
	 * @param name the name
	 * @return the property number for color
	 */
	public int getPropertyNumberForColor(String name) {
		Integer number = (Integer) colorGroups.get(name);
		if (number != null) {
			return number.intValue();
		}
		return 0;
	}

	/**
	 * Adds the cell.
	 *
	 * @param cell the cell
	 */
	public void addCell(PropertyCell cell) {
		String colorGroup = cell.getColorGroup();
		int propertyNumber = getPropertyNumberForColor(colorGroup);
		colorGroups.put(colorGroup, new Integer(propertyNumber + 1));
		gameBoardCellData.getCells().add(cell);
	}

	/**
	 * Gets the properties in monopoly.
	 *
	 * @param color the color
	 * @return the properties in monopoly
	 */
	public PropertyCell[] getPropertiesInMonopoly(String color) {
		PropertyCell[] monopolyCells = new PropertyCell[getPropertyNumberForColor(color)];
		int counter = 0;
		for (int i = 0; i < gameBoardCellData.getCellNumber(); i++) {
			Cell c = gameBoardCellData.getCell(i);
			if (c instanceof PropertyCell) {
				PropertyCell pc = (PropertyCell) c;
				if (pc.getColorGroup().equals(color)) {
					monopolyCells[counter] = pc;
					counter++;
				}
			}
		}
		return monopolyCells;
	}
}