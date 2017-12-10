package com.pattern.factory;

import java.util.ArrayList;
import java.util.List;

public class FactoryMain {
	public static void main(String[] args) {
		XmlFormat xfFormat= new XmlFormat();
		List<OS> osLists = new ArrayList<>();
		for(int i=0;i<10;i++){
			OS os1=OSFactory.getInstance("Open");
			os1.spec();
			osLists.add(os1);
			OS os2=OSFactory.getInstance("secured");
			os2.spec();
			osLists.add(os2);
			OS os3=OSFactory.getInstance("None");
			os3.spec();
			osLists.add(os3);
		}
		xfFormat.setOsLists(osLists);
		
	}
}
