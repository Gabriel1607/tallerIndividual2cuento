package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}Controller controller;
	public void settings() {
		size(700,700);
	}
	public void setup() {
		controller = new Controller(this);
	}
	public void draw() {
		
	}
	public void mouseClicked() {
		
		}
	}

