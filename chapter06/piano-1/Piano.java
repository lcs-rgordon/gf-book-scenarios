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
        // Say hello to everyone in the class, once each second
        // Be sure to run until the end of the array, but not past it
        if ((frames % 60 == 0) && (frames / 60 < peopleInClass.length))
        {
            // Show a value from the array on screen
            showText("Hello, " + peopleInClass[frames / 60], 400, 170);
        }

        // How many frames have been animated?
        showText("Frames: " + frames, 100, 50);

        // Track frame count
        frames += 1;        
    }
}