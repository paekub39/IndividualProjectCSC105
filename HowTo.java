import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowTo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowTo extends World
{

    /**
     * Constructor for objects of class HowTo.
     * 
     */
    public HowTo()
    {  
        super(800, 600, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK); 
        background.fill();
        createStars(300);
        addObject(new How(), 400, 300);
        addObject(new BackToMenu(), 750,550);
    }
    private void createStars(int num){
        GreenfootImage bg = getBackground();
        for(int i = 0; i<num; i++){
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            int color = 120 - Greenfoot.getRandomNumber(100);
            bg.setColor(new Color(color,color,color));
            bg.fillOval(x,y,2,2);
        }
    }
}
