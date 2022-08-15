import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startScreen extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("Ghostrifter-Official-Devyzed-Downtown-Glow.mp3");
    /**
     * Constructor for objects of class startScreen.
     * 
     */
    public startScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 800, 1); 
        prepare();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        pressEnter pressEnter = new pressEnter();
        addObject(pressEnter,494,167);
    }

    public void act(){
        backgroundMusic.playLoop();
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MyWorld());
            backgroundMusic.pause();
        }
        
        
    }
}
