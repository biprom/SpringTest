package com.example;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PersonRepository;
import com.model.Person;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;


@SpringView(name = MainPage.VIEW_NAME)

public class MainPage extends VerticalLayout implements View{
	
	
	
	public static final String VIEW_NAME = "";
	
	public MainPage(SpringViewProvider provider){
		
		// TODO Auto-generated method stub
				
				Label label = new Label("Dit is de hoofdpagina");
				addComponent(label);
				
				
				
				
	}

	@Override
	public void enter(ViewChangeEvent event) {
		
	
		
	}

}
