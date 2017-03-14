import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LoseBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoseBoard extends World
{

    /**
     * Constructor for objects of class LoseBoard.
     * 
     */
    public LoseBoard()
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
        showText("YOU LOSE!", 400, 200);
        if(Home.endEz && !Home.endMed && !Home.endHrd){
            showText("Score Kill : " + Easy.easyCount, 400, 400);
        }
        if(Home.endMed && !Home.endEz && !Home.endHrd){
            showText("Score Kill : " + Medium.mediumCount, 400, 400);
        }
        if(Home.endHrd && !Home.endEz && !Home.endMed){
            showText("Score Kill : " + Hard.hardCount, 400, 400);    

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
