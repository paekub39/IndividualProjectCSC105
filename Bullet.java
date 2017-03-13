import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{ 
    private static final int damage = 1;
    public Bullet(int rotation){
        setRotation(rotation);
    }
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever 
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(this.getY() == 0){
            getWorld().removeObject(this);
        }
        else{
            move(-5);
            checkEnemyHit();
        }
    }
    
    private void checkEnemyHit(){
        Enemy emy = (Enemy) getOneIntersectingObject(Enemy.class);
        if(emy != null){
            emy.hit(damage);
            getWorld().removeObject(this);
        }
    }
}
