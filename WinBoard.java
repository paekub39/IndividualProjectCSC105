import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinBoard extends World
{

    /** 
     * Constructor for objects of class ScoreBoard.
     * 
     */
    public WinBoard()
    {    
        super(800, 600, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK); 
        background.fill();
        createStars(300);
        
        addObject(new BackToMenu(), 400, 500);
    }
    
    public void act(){
        showText("Scoreboard", 400, 100);
        if(Home.endEz){
            showText("YOU WIN!", 400, 200);
            showText("Time remaining : " + (Easy.timer/60), 400, 400);
            Home.endEz = false;
        }
        if(Home.endMed){
            showText("YOU WIN!", 400, 200);
            showText("Time remaining : " + (Medium.timer/60), 400, 400);
            Home.endMed = false;
        }
        if(Home.endHrd){
            showText("YOU WIN!", 400, 200);
            showText("Time remaining : " + (Hard.timer/60), 400, 400);
            Home.endHrd = false;
        }
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
