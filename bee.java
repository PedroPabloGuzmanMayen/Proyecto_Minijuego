import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee extends Mover
{
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         move();
         setImage("bee.png");
         if ( atWorldEdge() ){
             turn(Greenfoot.getRandomNumber(360));
             move(Greenfoot.getRandomNumber(360));
         }
         
         if (isTouching(House1.class)){
             turn(Greenfoot.getRandomNumber(360));
         }
         if (isTouching(bee.class)){
             turn(Greenfoot.getRandomNumber(360));
         }
        
         
    }
   
       
    }
    

