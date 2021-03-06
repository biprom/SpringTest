package com.example;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.PersonRepository;
import com.model.Person;
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
	
	@Autowired
	PersonRepository personRepository;

	@Override
	protected void init(VaadinRequest request) {
		// TODO Auto-generated method stub
		
			personRepository.deleteAll();
		
			personRepository.insert(new Person(new Date(), "Jolien", "Callens"));
			personRepository.insert(new Person(new Date(), "Brambie", "Vandenberbie"));
		
		
		Navigator navigator = new Navigator(this, this);
		navigator.addProvider(viewProvider);
		navigator.navigateTo(MainPage.VIEW_NAME);
	} 

}
