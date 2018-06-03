package application;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MineButton extends Button{
	private int row;
	private int col;
	
	public MineButton(int row,int col) {
		this.row = row;
		this.col = col;
	}
	
	public int getRow() {
		return row;
	}	
	public int getCol() {
		return col;
	}

}
