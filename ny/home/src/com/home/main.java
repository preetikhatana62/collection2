package com.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main  {
	public static void main(String[] args) {
		List<melon>Melon=new ArrayList<melon>(); 
		Melon.add(new melon("Apollo",12));
		Melon.add(new melon("jada dew",43));
		Melon.add(new melon("cantaloupe",65));
		Melon.add(new melon("gac",76));
		Melon.add(new melon("hami",75));
		
		List<String> secondList=Arrays.asList("Apollo","gac","Crenshaw","hami");
		System.out.println(Melon);
		System.out.println(secondList);
		
		for(int i=0;i!=Melon.size();i++)
		{
		boolean m=	Melon.get(i).equals(secondList);
		System.out.println(m);
		}
	}

}
