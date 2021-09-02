package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	private static Student studentD;
	private static SimplePresentationScreen screen;
	
	public static void main(String [] args) {
		
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        	
            public void run() {
            	studentD = new Student(114024, "Cano", "Micaela", "mica.709@gmail.com", "https://github.com/micaasd", "imagenes/student_img.jpg");
            	screen = new SimplePresentationScreen(studentD);
            	screen.setVisible(true);
            	
            }
        });
    }
}