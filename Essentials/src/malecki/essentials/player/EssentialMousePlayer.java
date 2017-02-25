/**
 * Copyright (c) Feb 25, 2017 Daniel E. Malecki
 * All rights reserved.
 */
package malecki.essentials.player;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

/**
 * essential logic for a mouse controlled player
 *
 * @author dmalecki
 */
public class EssentialMousePlayer extends EssentialPlayer {

	/**
	 * sets basic values
	 *
	 * @param ORIGx1
	 * @param ORIGy1
	 * @param ORIGx2
	 * @param ORIGy2
	 * @throws SlickException
	 */
	public EssentialMousePlayer(float ORIGx1, float ORIGy1, float ORIGx2, float ORIGy2)
			throws SlickException {
		super(ORIGx1, ORIGy1, ORIGx2, ORIGy2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void checkInput(GameContainer gc) {
		setX1(gc.getInput().getMouseX() - getHeight() / 2);
		setY1(gc.getInput().getMouseY() - getWidth() / 2);
		gc.setMouseGrabbed(true);
	}
}
