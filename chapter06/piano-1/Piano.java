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
    // Store the computer keyboard keys that white piano keys will respond to
    private String[] whiteKeys =
        { "a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "\\" };
        
    // Store the sound files that will be played when a white piano key is pressed
    private  String[] whiteNotes =
        { "3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g" };

    // Store the computer keyboard keys that black piano keys will respond to
    private String[] blackKeys =
        { "w", "e", "", "t", "y", "u", "", "o", "p", "", "]", ""}; 
        
    // Store the sound files that will be played when a black piano key is pressed
    private String[] blackNotes =
        { "3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#", "" }; 

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
        
        // Draw all of the white piano keys on the screen
        if ((frames % 60 == 0) && (position < whiteKeys.length))
        {
            // Create a new Key object
            Key newKey = new Key(whiteKeys[position], whiteNotes[position], true);
            
            // Add the key object to the scenario
            addObject(newKey, 54 + 63 * position, 140);
        }

        // Draw all of the black piano keys on the screen
        // Condition 1: Only add keys on full second increments
        // Condition 2: Add black keys after white keys are drawn
        // Condition 3: Stop adding black keys when position is 24
        if (
            (frames % 60 == 0) && 
            (position >= whiteKeys.length) &&
            (position < blackKeys.length * 2)
            )
        {

            // Add black piano key only when correponding keyboard key 
            // is not blank
            // Must subtract blackKey array length, since position is already
            // incremented past 12 (when white keys were added)
            if (blackKeys[position - blackKeys.length] != "")
            {
                // Create a new black Key object
    
                Key newKey = new Key(blackKeys[position - blackKeys.length], 
                                     blackNotes[position - blackKeys.length],
                                     false);
                
                // Add the key object to the scenario
                addObject(newKey, 85 + 63 * (position - blackKeys.length), 86);
            }
        }

        
        // How many frames have been animated?
        showText("Frames: " + frames, 100, 50);
        
        // Show the current array position (index)
        showText("Array position, or index, is: " + position, 195, 100);

        // Track frame count
        frames += 1;        
    }
}