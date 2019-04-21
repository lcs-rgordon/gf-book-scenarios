import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance variables / objects
     * (can be used by any method in this class)
     */
    private boolean isDown;
    
    /**
     * Create a new key.
     */
    public Key()
    {
        // Key object begins life in the "up" position
        isDown = false;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        // When the piano key is not down, and the keyboard key was just pressed
        if ( isDown == false && Greenfoot.isKeyDown("g") == true)
        {
            // Make the piano key appear to be down and play the sound
            setImage("white-key-down.png");
            play();
            isDown = true;
        }
        
        // When the piano key is down, and the keyboard key was just released
        if ( isDown == true && Greenfoot.isKeyDown("g") == false )
        {
            // Make the piano key appear to be up
            setImage("white-key.png");
            isDown = false;
        }
    }
    
    /**
     * Play the note of this key.
     */
    public void play()
    {
        Greenfoot.playSound("3a.wav");
    }
}

