package com.zabdwi.PropertyEditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
	
		String upperCase = text.toUpperCase();
		setValue(upperCase);
		
	}

}
