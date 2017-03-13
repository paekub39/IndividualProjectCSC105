import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RestartHrd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RestartHrd extends Actor
{
    /**
     * Act - do whatever the RestartHrd wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Hard.timer = 10800;
            Rocket.hp = 10;
            Hard.hardCount = 0;
            Greenfoot.setWorld(new Hard());
        }
    }    
}
