package edu.ucsb.cs56.projects.game.alva;

import java.awt.image.BufferedImage;

import edu.ucsb.cs56.projects.game.alva.Graphics.Animation;
import edu.ucsb.cs56.projects.game.alva.Graphics.Texture;
/** A class that declares and creates references for all animations, textures, and images
 */

public class Assets {
    
    public static BufferedImage robot_jleft = GameDriver.addImage("assets/Robot/Left/Jumping/robotjumpingframe1.png");
    public static BufferedImage robot_jright = GameDriver.addImage("assets/Robot/Right/Jumping/robotjumpingframe1.png");
    public static BufferedImage robot_fleft = GameDriver.addImage("assets/Robot/Left/Jumping/robotfallingframe1.png");
    public static BufferedImage robot_fright = GameDriver.addImage("assets/Robot/Right/Jumping/robotfallingframe1.png");
    public static BufferedImage robot_rSwitch1 = GameDriver.addImage("assets/Robot/Right/Switch/r_switch1.png");
    public static BufferedImage robot_rSwitch2 = GameDriver.addImage("assets/Robot/Right/Switch/r_switch2.png");
    public static BufferedImage robot_rSwitch3 = GameDriver.addImage("assets/Robot/Right/Switch/r_switch3.png");
    public static BufferedImage robot_lSwitch1 = GameDriver.addImage("assets/Robot/Left/Switch/l_switch1.png");
    public static BufferedImage robot_lSwitch2 = GameDriver.addImage("assets/Robot/Left/Switch/l_switch2.png");
    public static BufferedImage robot_lSwitch3 = GameDriver.addImage("assets/Robot/Left/Switch/l_switch3.png");
    public static BufferedImage robot_rGrab1 = GameDriver.addImage("assets/Robot/Right/Grabbing/robotgrabbingframe1.png");
    public static BufferedImage robot_rGrab2 = GameDriver.addImage("assets/Robot/Right/Grabbing/robotgrabbingframe2.png");
    public static BufferedImage robot_rGrab3 = GameDriver.addImage("assets/Robot/Right/Grabbing/robotgrabbingframe3.png");
    public static BufferedImage robot_rGrab4 = GameDriver.addImage("assets/Robot/Right/Grabbing/robotgrabbingframe4.png");
    public static BufferedImage robot_lGrab1 = GameDriver.addImage("assets/Robot/Left/Grabbing/robotgrabbingframe1.png");
    public static BufferedImage robot_lGrab2 = GameDriver.addImage("assets/Robot/Left/Grabbing/robotgrabbingframe2.png");
    public static BufferedImage robot_lGrab3 = GameDriver.addImage("assets/Robot/Left/Grabbing/robotgrabbingframe3.png");
    public static BufferedImage robot_lGrab4 = GameDriver.addImage("assets/Robot/Left/Grabbing/robotgrabbingframe4.png");
    public static BufferedImage robot_rFinish1 = GameDriver.addImage("assets/Robot/Right/Finish/r_finish1.png");
    public static BufferedImage robot_rFinish2 = GameDriver.addImage("assets/Robot/Right/Finish/r_finish2.png");
    public static BufferedImage robot_rFinish3 = GameDriver.addImage("assets/Robot/Right/Finish/r_finish3.png");
    public static BufferedImage robot_rFinish4 = GameDriver.addImage("assets/Robot/Right/Finish/r_finish4.png");
    public static BufferedImage robot_lFinish1 = GameDriver.addImage("assets/Robot/Left/Finish/l_finish1.png");
    public static BufferedImage robot_lFinish2 = GameDriver.addImage("assets/Robot/Left/Finish/l_finish2.png");
    public static BufferedImage robot_lFinish3 = GameDriver.addImage("assets/Robot/Left/Finish/l_finish3.png");
    public static BufferedImage robot_lFinish4 = GameDriver.addImage("assets/Robot/Left/Finish/l_finish4.png");
    public static Animation jleft;
    public static Animation jright; 
    public static Animation fleft;
    public static Animation fright; 
    public static Animation rSwitch;
    public static Animation lSwitch;
    public static Animation rGrab;
    public static Animation lGrab;
    public static Animation rFinish;
    public static Animation lFinish;
    public static Texture redTile;
    public static Texture platformTile;
    public static Texture BackgroundTile;
    public static Texture finish;
    public static Texture robot;
    public static Texture robot_left;
    public static Texture box;
    public static Animation robotAnim;
    public static Animation robotAnim_left;
    private static BufferedImage robotSpriteSheet = GameDriver.addImage("src/assets/Spread Sheet Final.png");
    private static BufferedImage robotleftSpriteSheet = GameDriver.addImage("assets/Robot/Left/Moving/RobotMovingLeft.png");
    public static Texture Switch1;
    public static Texture Switch2;
    public static Texture SwitchOn;
    public static Texture SwitchMid;
    public static Texture SwitchOff;
    public static Animation switchAnimOn;
    public static Animation switchAnimOff;
    public static BufferedImage LoadScreen = GameDriver.addImage("src/assets/LoadScreen.png");
    
    /** Declares all references to new objects of the same type. This creates all the assets we need.
     */
    public static void loadAssets() {
    	//robot_jright = GameDriver.addImage("assets/Robot/Right/Jumping/robotjumpingframe1.png");
	//robot_jleft = GameDriver.addImage("assets/Robot/Left/Jumping/robotjumping1.png");
	jleft = new Animation(20);
	jleft.addFrame(new Texture(robot_jleft));
	jright = new Animation(20);
	jright.addFrame(new Texture(robot_jright));
    fleft = new Animation(20);
	fleft.addFrame(new Texture(robot_fleft));
	fright = new Animation(20);
	fright.addFrame(new Texture(robot_fright));
    rSwitch = new Animation(40);
    rSwitch.addFrame(new Texture(robot_rSwitch1));
    rSwitch.addFrame(new Texture(robot_rSwitch2));
    rSwitch.addFrame(new Texture(robot_rSwitch3));
    rSwitch.addFrame(new Texture(robot_rSwitch2));
    lSwitch = new Animation(40);
    lSwitch.addFrame(new Texture(robot_lSwitch1));
    lSwitch.addFrame(new Texture(robot_lSwitch2));
    lSwitch.addFrame(new Texture(robot_lSwitch3));
    lSwitch.addFrame(new Texture(robot_lSwitch2));
    rGrab = new Animation(20);
    rGrab.addFrame(new Texture(robot_rGrab1));
    rGrab.addFrame(new Texture(robot_rGrab2));
    rGrab.addFrame(new Texture(robot_rGrab3));
    rGrab.addFrame(new Texture(robot_rGrab4));
    lGrab = new Animation(20);
    lGrab.addFrame(new Texture(robot_lGrab1));
    lGrab.addFrame(new Texture(robot_lGrab2));
    lGrab.addFrame(new Texture(robot_lGrab3));
    lGrab.addFrame(new Texture(robot_lGrab4));
    rFinish = new Animation(20);
    rFinish.addFrame(new Texture(robot_rFinish1));
    rFinish.addFrame(new Texture(robot_rFinish2));
    rFinish.addFrame(new Texture(robot_rFinish3));
    rFinish.addFrame(new Texture(robot_rFinish4));
    lFinish = new Animation(20);
    lFinish.addFrame(new Texture(robot_lFinish1));
    lFinish.addFrame(new Texture(robot_lFinish2));
    lFinish.addFrame(new Texture(robot_lFinish3));
    lFinish.addFrame(new Texture(robot_lFinish4));
    
    Switch1 = new Texture(GameDriver.addImage("src/assets/Switch.png"));
    Switch2 = new Texture(GameDriver.addImage("src/assets/Switch2.png"));
    SwitchOn = new Texture(GameDriver.addImage("src/assets/switch_on.png"));
    SwitchMid = new Texture(GameDriver.addImage("src/assets/switch_half.png"));
    SwitchOff = new Texture(GameDriver.addImage("src/assets/switch_off.png"));
    redTile = new Texture(GameDriver.addImage("assets/Tiles/Steel_X.png"));
    platformTile = new Texture(GameDriver.addImage("assets/Tiles/Steel_X_Platform.png"));
    BackgroundTile = new Texture(GameDriver.addImage("assets/Tiles/Background.png"));
    finish = new Texture(GameDriver.addImage("assets/Tiles/Finish.png"));
    robot = new Texture(GameDriver.addImage("src/assets/Robot.png"));
	robot_left = new Texture(GameDriver.addImage("assets/Robot/Left/Moving/robotmovingframe1.png"));
    box = new Texture(GameDriver.addImage("src/assets/Moveable box.png"));
    robotAnim = new Animation(20);
    for(int i = 0; i < 280; i += 70) {
        robotAnim.addFrame(new Texture(robotSpriteSheet.getSubimage(i, 0, 70, 103)));
    }
	robotAnim_left = new Animation(20);
	int j;
	int k;
        for( k = 0; k < 208; k += 104){
	    for(j = 0; j < 146; j += 73){
		robotAnim_left.addFrame(new Texture(robotleftSpriteSheet.getSubimage(j,k,70,103)));
	    }
	}
    switchAnimOn = new Animation(20);
    switchAnimOn.addFrame(SwitchOn);
    switchAnimOn.addFrame(SwitchMid);
    switchAnimOn.addFrame(SwitchOff);
    switchAnimOff = new Animation(20);
    switchAnimOff.addFrame(SwitchOff);
    switchAnimOff.addFrame(SwitchMid);
    switchAnimOff.addFrame(SwitchOn);
    }
    
}