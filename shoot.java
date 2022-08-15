import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shoot extends Mover
{
    private int life = Greenfoot.getRandomNumber(40)+10;
    
    /**
     * Act - do whatever the shoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       move(10.0);
       life --;
       
       Actor bee = getOneIntersectingObject(bee.class);
       Actor House1 = getOneIntersectingObject(House1.class);

        Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
       if (bee != null){
           World myWorld = getWorld();
           myWorld.removeObject(bee);
           myWorld.removeObject(this);
       } else if(life ==0) {
           getWorld().removeObject(this);
           
       } else if (House1 != null){
           getWorld().removeObject(this);
           
           counter.add(1);
       }
       
       
    }
    
}
