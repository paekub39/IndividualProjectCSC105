import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackToMenu extends Actor
{
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Hard.timer = 10800;
            Rocket.hp = 10;
            Hard.hardCount = 0;
            Medium.timer = 9000;
            Medium.mediumCount = 0;
            Easy.timer = 7200;
            Easy.easyCount = 0;
            Greenfoot.setWorld(new Home());
        }
    }    
}
