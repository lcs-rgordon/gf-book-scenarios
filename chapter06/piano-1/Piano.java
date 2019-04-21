import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Instance variables / objects
     * (can be used by any method in this class)
     */
    private String[] peopleInClass = {"Chelsea", "Sarah", "Jack", "Maxwell", 
            "Justy", "Peter", "Jeewoo", "Brandon", "Minah", "Gavin", "Mr. Gordon"};
            
    // Store the computer keyboard keys that white piano keys will respond to
    private String[] whiteKeys =
        { "a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "\\" };
        
    // Store the sound files that will be played when a white piano key is pressed
    private  String[] whiteNotes =
        { "3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g" };

    // Track how many frames have been animated
    private int frames;

    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);

        // No frames animated at start
        frames = 0;
    }

    /**
     * Runs about 60 times each second, until the scenario stops.
     */
    public void act()
    {
        // Track what position we are in for the array
        int position = frames / 60;
        
        // Say hello to everyone in the class, once each second
        // Be sure to run until the end of the array, but not past it
        if ((frames % 60 == 0) && (position < peopleInClass.length))
        {
            // Show a value from the array on screen
            showText("Hello, " + peopleInClass[position], 400, 170);
        }

        // How many frames have been animated?
        showText("Frames: " + frames, 100, 50);
        
        // Show the current array position (index)
        showText("Array position, or index, is: " + position, 195, 100);

        // Track frame count
        frames += 1;        
    }
}