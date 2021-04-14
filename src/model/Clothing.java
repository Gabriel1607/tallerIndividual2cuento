package model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Clothing extends PApplet {
PApplet app;
protected int posX,posY,tam;
protected boolean isInteract;
protected String cloth;
protected PImage dress;
protected PImage hat;
protected PImage jewels;
protected PImage shoes;
public Clothing(int posX, int posY, int tam, String cloth, boolean isInteract, PApplet app) {
	
	this.posX=posX;
	this.posY=posY;
	this.tam=tam;
	isInteract=false;
	dress=loadImage("images/dress.png");
	hat=loadImage("hat/dress.png");
	jewels=loadImage("jewels/dress.png");
	shoes=loadImage("shoes/dress.png");
}
protected void drawClothes(PImage cloth) {
	image(cloth,posX,posY,tam,tam);

}
public PImage getDress() {
	return dress;
}
public PImage getHat() {
	return hat;
}
public PImage getJewels() {
	return jewels;
}
public PImage getShoes() {
	return shoes;
}

}
