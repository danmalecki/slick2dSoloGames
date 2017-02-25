/**
 * Copyright (c) Feb 21, 2017 Daniel E. Malecki
 * All rights reserved.
 */
package malecki.essentials.objects;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 * essential methods shared by all game objects
 *
 * @author dmalecki
 */
public interface EssentialObject {

	/**
	 * renders object to the screen
	 *
	 * @param gc
	 * @param g
	 */
	public void render(GameContainer gc, Graphics g);

	/**
	 * updates the object relative to the game
	 *
	 * @param gc
	 * @param t
	 * @throws SlickException
	 */
	public void update(GameContainer gc, int t) throws SlickException;

	/**
	 * resets the object to it's original state
	 */
	public void reset();
}
