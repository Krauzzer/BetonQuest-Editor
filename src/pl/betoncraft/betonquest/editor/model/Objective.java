/**
 * BetonQuest Editor - advanced quest creating tool for BetonQuest
 * Copyright (C) 2015  Jakub "Co0sh" Sapalski
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pl.betoncraft.betonquest.editor.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Represents a BetonQuest objective.
 *
 * @author Jakub Sapalski
 */
public class Objective {
	
	private StringProperty id;
	private StringProperty instruction;
	
	public Objective(String id, String instruction) {
		this.id = new SimpleStringProperty(id);
		this.instruction = new SimpleStringProperty(instruction);
	}
	
	public String getId() {
		return id.get();
	}
	public void setId(String id) {
		this.id.set(id);
	}
	public String getInstruction() {
		return instruction.get();
	}
	public void setInstruction(String instruction) {
		this.instruction.set(instruction);
	}

	@Override
	public String toString() {
		return id.get();
	}

}
