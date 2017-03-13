import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 *  
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home  extends World
{
    public static boolean endEz, endMed, endHrd;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Home()
    {   
        super(800, 600, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK); 
        background.fill();
        addObject(new Logo(), 400, 180);
        createStars(300);
        addObject(new PlayEasy(), 200, 400);
        addObject(new PlayMedium(), 400, 400);
        addObject(new PlayHard(), 600, 400);
        addObject(new HowToPlay(), 400, 500);
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
