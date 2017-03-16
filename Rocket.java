import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor 
{
    private static final int gunReloadTime = 10;
    private int reloadDelayCount;
    int player;
    public static int hp = 10;
    public Rocket(){
        reloadDelayCount = 10;
    }
    
    public Rocket(int player){
        this.player = player;
    }
    
    private void checkKey(){
        if(Greenfoot.isKeyDown("space")){
            fire();
        }
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")){
            this.setImage("rsz_left.png");
            this.setLocation(getX()-3,getY());
        }
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")){
            this.setImage("rsz_right.png");
            this.setLocation(getX()+3,getY());
        }
        if(!(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("d"))){
            this.setImage("rsz_mid.png");
        }
        
    }
    
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKey();
        reloadDelayCount++;
    }    
    
    public void hit(int damage){
        this.hp -= damage;
        if(this.hp <=0){
            Explosion explo = new Explosion();
            getWorld().addObject(explo, getX(), getY());
            getWorld().removeObject(this);
        }
    }
    
    public void fire(){
        if(reloadDelayCount >= gunReloadTime){
            Greenfoot.playSound("rgun.wav");
            Bullet bullet = new Bullet(this.getRotation()+90);
            getWorld().addObject(bullet, getX(), getY()-30);
            reloadDelayCount = 0;
        }
    }
}
