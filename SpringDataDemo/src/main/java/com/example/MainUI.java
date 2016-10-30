package com.example;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.UI;

@SpringUI
@Theme("valo")

public class MainUI extends UI{
	
	@Autowired
	public SpringViewProvider viewProvider;

	@Override
	protected void init(VaadinRequest request) {
		// TODO Auto-generated method stub
		Navigator navigator = new Navigator(this, this);
		navigator.addProvider(viewProvider);
		navigator.navigateTo(MainPage.VIEW_NAME);
	} 

}
