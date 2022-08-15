import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World
{
    private Counter counter;
    private player player;
    
    public MyWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setBackground("sky.png");
        player = new player();
        counter = new Counter(); 
        prepare();
    }
    public MyWorld(player p, Counter c){
        super(800, 600, 1);
        this.player = p;
        this.counter = c;
        prepare();
        setBackground("sky.png");
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        bee bee = new bee();
        addObject(bee,537,286);
        bee[] bees = new bee[Greenfoot.getRandomNumber(7)];
        for (int i = 0; i < bees.length; i++){
            bees[i] = new bee();
            int beeX = Greenfoot.getRandomNumber(getWidth());
            int beeY = Greenfoot.getRandomNumber(getHeight());
            addObject(bees[i], beeX, beeY);
        }
        
        addObject(counter,57,23);
        
        addObject(player,235,309);
        
        
        House1 house1 = new House1();
        addObject(house1,199,144);
        player.setLocation(231,302);
        player.setLocation(213,386);
        player.setLocation(380,440);
        
        
        House1 house12 = new House1();
        addObject(house12,514,140);
        
        
        House1 house13 = new House1();
        addObject(house13,80,335);
        
        
        House1 house14 = new House1();
        addObject(house14,335,317);
        
        
        House1 house15 = new House1();
        addObject(house15,611,319);
        
        
        House1 house16 = new House1();
        addObject(house16,238,496);

 
        House1 house17 = new House1();
        addObject(house17,614,484);
        player.setLocation(345,518);
        player player12 = new player();
        addObject(player12,318,481);
        removeObject(player12);
      
    }
    public void act(){
        if(getObjects(bee.class).size() == 0){
            Greenfoot.setWorld(new MyWorld(player, counter));
        }
    }
        
    }
