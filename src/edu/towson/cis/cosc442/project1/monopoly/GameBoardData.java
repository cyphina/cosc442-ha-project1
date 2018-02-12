package edu.towson.cis.cosc442.project1.monopoly;


import java.util.ArrayList;
import java.util.Hashtable;

public class GameBoardData {
	private GameBoardCellData gameBoardCellData = new GameBoardCellData();
	private Hashtable<String, Integer> colorGroups = new Hashtable<String, Integer>();

	public ArrayList<Cell> getCells() {
		return gameBoardCellData.getCells();
	}

	public Cell getCell(int newIndex) {
		return gameBoardCellData.getCell(newIndex);
	}

	public int getCellNumber() {
		return gameBoardCellData.getCellNumber();
	}

	public Cell queryCell(String string) {
		return gameBoardCellData.queryCell(string);
	}

	public int queryCellIndex(String string) {
		return gameBoardCellData.queryCellIndex(string);
	}

	public int getPropertyNumberForColor(String name) {
		Integer number = (Integer) colorGroups.get(name);
		if (number != null) {
			return number.intValue();
		}
		return 0;
	}

	public void addCell(PropertyCell cell) {
		String colorGroup = cell.getColorGroup();
		int propertyNumber = getPropertyNumberForColor(colorGroup);
		colorGroups.put(colorGroup, new Integer(propertyNumber + 1));
		gameBoardCellData.getCells().add(cell);
	}

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