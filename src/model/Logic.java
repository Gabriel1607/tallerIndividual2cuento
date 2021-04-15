package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic extends PApplet {
	String[] loadStory;
	String[] loadStoryModify;
	ArrayList<String> storyWords;
	
	ArrayList<Clothing> selectWords;
	PApplet app;
	public Logic(PApplet app) {
		this.app = app;
		loadStory = app.loadStrings("texts/story.txt");
		loadStoryModify = app.loadStrings("texts/storyModify.txt");
		storyWords=new ArrayList<String>();
	
	for (int index = 0; index < loadStory.length; index++) {
		String[] arrayWords = loadStory[index].split(" ");

		for (int j = 0; j < arrayWords.length; j++) {
			storyWords.add(arrayWords[j]);
			if(arrayWords[j].equals("vestido")) {
			//	selectWords.add(new Dress(100,100,100,"vestido",false,this));
				System.out.println("vestido");
			}
			if(arrayWords[j].equals("tacones")) {
				//	selectWords.add(new Shoes(100,100,100,"tacones",false,this));
					System.out.println("tacones");
				}
			if(arrayWords[j].equals("sombrero")) {
				//selectWords.add(new Hat(100,100,100,"sombrero",false,this));
				System.out.println("sombrero");
			}
			if(arrayWords[j].equals("joyas")) {
				//selectWords.add(new Jewels(100,100,100,"joyas",false,this));
				System.out.println("joyas");
			}
			
			//selectWords.add(new Clothing())
		}
	}
	
	for (int i = 0; i < storyWords.size(); i++) {
		System.out.println(storyWords.get(i));
	}

}
}
