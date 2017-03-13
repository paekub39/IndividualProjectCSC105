import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private int hp;
    private int lvl;
    private final int gunReloadTime = Greenfoot.getRandomNumber(200)+150;
    private int reloadDelayCount;
    int mov = 0;
    boolean isMoveLeft;
    public Enemy(){
    }
    
    public Enemy(int level){
        this.lvl = level;
        this.hp = level*10;
        if(level == 1){
            this.setImage("rsz_enemy01.png"); 
        }
        if(level == 2){
            this.setImage("rsz_enemy02.png");
        }
        if(level == 3){
            this.setImage("rsz_enemy03.png");
        }
    }
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(mov < 20){
            this.setLocation(getX()-1, getY());
            mov++;
            isMoveLeft = true;
        }
        else{
            if(mov < 60 &&  isMoveLeft){
                this.setLocation(getX()+1, getY());
                mov++;
                if(mov == 59) isMoveLeft = false;
            }
            if(mov >= 40 && !isMoveLeft){
                this.setLocation(getX()-1, getY());
                mov--;
                if(mov == 40) isMoveLeft = true;
            }
        }
        fire();
        reloadDelayCount++;
    }    
    
    public void hit(int damage){
        hp = hp - damage;
        if(hp <=0){ 
            Explosion explo = new Explosion();
            getWorld().addObject(explo, getX(), getY());
            Easy.easyCount++;
            Medium.mediumCount++;
            Hard.hardCount++;
            getWorld().removeObject(this);
        }
    }
    
    public void fire(){
        if(reloadDelayCount >= gunReloadTime){
            Greenfoot.playSound("egun.wav");
            EBullet bullet = new EBullet(this.getRotation()-90, this.lvl);
            getWorld().addObject(bullet, getX(), getY()+30);
            reloadDelayCount = 0;
        }
    }
    
    public void movement(){
        if(mov == 0){
            for(int i = 0; i<20; i++){
                this.setLocation(getX()-3, getY());
            }
            mov++;
        }
        else{
            for(int i = 0; i<40; i++){
                this.setLocation(getX()+1, getY());
            }
            for(int i = 0; i<40; i++){
                this.setLocation(getX()-1, getY());
            }
        }
    }
}
