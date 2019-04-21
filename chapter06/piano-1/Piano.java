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
    "Justy", "Peter", "Jeewoo", "Brandon", "Minah", "Gavin"};
    
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
        // Show a value from the array on screen
        showText("Hello, " + peopleInClass[2], 400, 170);
        
        // How many frames have been animated?
        showText("Frames: " + frames, 100, 50);
        
        // Track frame count
        frames += 1;        
    }
}