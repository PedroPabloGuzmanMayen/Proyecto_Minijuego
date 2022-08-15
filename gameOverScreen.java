import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOverScreen extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("sadSong.mp3");
    /**
     * Constructor for objects of class gameOverScreen.
     * 
     */
    public gameOverScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        gameOver gameOver = new gameOver();
        addObject(gameOver,300,202);

        enterAgain enterAgain = new enterAgain();
        addObject(enterAgain,304,325);
    }

    public void act(){
        backgroundMusic.playLoop();
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MyWorld());
            backgroundMusic.pause();
        }
    }
}