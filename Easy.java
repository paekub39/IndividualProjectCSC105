import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends World
{
    public int amountMon = 10;
    public static int easyCount = 0;
    Enemy emy;
    public static int timer = 7200;
    /** 
     * Constructor for objects of class Easy.
     * 
     */   
    public Easy()
    {    
        super(800, 600, 1); 
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK); 
        background.fill();
        createStars(300);
        
        addObject(new RestartEasy(), 750, 120);
        addObject(new BackToMenu(), 750, 60);
        addObject(new Rocket(), 400, 520);
        for(int i = 0; i<2; i++){
            for(int j = 0; j<5; j++){
                addObject(new Enemy(1), 150+((j)*(120)), 100+(i*100));
            }
        }
    }
    
    public void act(){
        if(timer>0){
            showText("Time: "+timer/60 , 400, 30);
            showText("HP: "+Rocket.hp, 50, 30);
            timer--;
            if(timer == 0 || Rocket.hp == 0){
                Home.endEz = true;
                Home.endMed = false;
                Home.endHrd = false;
                Greenfoot.setWorld(new LoseBoard());
            }
        }
        if(easyCount == amountMon){
            Home.endEz = true;
            Home.endMed = false;
            Home.endHrd = false;
            Greenfoot.setWorld(new WinBoard());
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
