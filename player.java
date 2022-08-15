
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    public void Player()
    {
        GreenfootImage myImage = getImage();
        int height = (int)myImage.getHeight()*20;
        int width = (int)myImage.getWidth()*20;
        myImage.scale(height, width);
        
        
    }
    public void act()
    {
       
     
        if (Greenfoot.isKeyDown("D")){
            setImage("char_walk_right.gif");
            setRotation(0);
            turn(2);
            move(2);
        }
        if (Greenfoot.isKeyDown("A")){
            setRotation(-180);
            setImage("char_walk_left.gif");
            move(2);
        }
        if (Greenfoot.isKeyDown("W")){
            setRotation(270);
            move(2);
        }
        if (Greenfoot.isKeyDown("S")){
            setRotation(90);
            move(2);
        }
        
        
        if ("space".equals(Greenfoot.getKey())){
            shot();
            Greenfoot.playSound("shotSound.mp3");
        
        }
        hitEnemy();
    }
    
    public void hitEnemy(){
        Actor bee = getOneIntersectingObject(bee.class);
        
        if(bee != null){
            Greenfoot.setWorld(new gameOverScreen());
            World myWorld = getWorld();
            myWorld.removeObject(this);
        }
    }
    private void shot(){
        shoot shot = new shoot();
        Greenfoot.playSound("shotSound.mp3");
        getWorld().addObject(shot, getX(), getY());
        shot.setRotation(getRotation());
        shot.move(60.0);
    }
    
    }


