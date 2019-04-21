import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance variables / objects
     * (can be used by any method in this class)
     */
    private boolean isDown;
    
    // Store what keyboard key to respond to
    private String key;
    // Store what sound file to play when pressed
    private String sound;
    
    // Tracks whether this instance of the Key class is a white key
    private boolean isKeyWhite;
    
    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile, boolean keyWhite)
    {
        // Key object begins life in the "up" position
        isDown = false;
        
        // Initialize key and sound instance variables
        key = keyName;
        sound = soundFile;
        
        // Set what type of key this is instance is
        isKeyWhite = keyWhite;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        // When the piano key is not down, and the keyboard key was just pressed
        if ( isDown == false && Greenfoot.isKeyDown(key) == true)
        {
            // Make the piano key appear to be down and play the sound
            setImage("white-key-down.png");
            play();
            isDown = true;
        }
        
        // When the piano key is down, and the keyboard key was just released
        if ( isDown == true && Greenfoot.isKeyDown(key) == false )
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
        Greenfoot.playSound(sound + ".wav");
    }
}

