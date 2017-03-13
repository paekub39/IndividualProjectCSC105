import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EBullet extends Actor
{
    private int dmg;
    public EBullet(int rotation,int lvl){
        setRotation(rotation);
        if(lvl == 1){
            dmg = 1;
        }
        if(lvl == 2){
            dmg = 5;
        }
        if(lvl == 3){
            dmg = 10;
        }
    }
    /**
     * Act - do whatever the EBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        if(this.getY() == 599){
            getWorld().removeObject(this);
        }
        else{ 
            move(-5);
            checkRocketHit();
        }
    } 
    private void checkRocketHit(){
        Rocket rck = (Rocket) getOneIntersectingObject(Rocket.class);
        if(rck != null){
            rck.hit(dmg);
            getWorld().removeObject(this);
        }
    }
}
