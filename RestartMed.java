import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RestartMed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RestartMed extends Actor
{
    /**
     * Act - do whatever the RestartMed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Medium.timer = 9000;
            Rocket.hp = 10;
            Medium.mediumCount = 0;
            Greenfoot.setWorld(new Medium());
        }
    }    
}
