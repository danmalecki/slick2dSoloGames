/**
 * Copyright (c) Feb 24, 2017 Daniel E. Malecki
 * All rights reserved.
 */
package malecki.essentials.player;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

/**
 * essential logic for a keyboard player
 *
 * @author dmalecki
 */
public class EssentialKeyboardPlayer extends EssentialPlayer {

	/**
	 * sets the basic values
	 *
	 * @param ORIGx1
	 * @param ORIGy1
	 * @param ORIGx2
	 * @param ORIGy2
	 * @throws SlickException
	 */
	public EssentialKeyboardPlayer(float ORIGx1, float ORIGy1, float ORIGx2, float ORIGy2)
			throws SlickException {
		super(ORIGx1, ORIGy1, ORIGx2, ORIGy2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void checkInput(GameContainer gc) {
		yAxisInput(gc);
		xAxisInput(gc);
	}

	/**
	 * takes in x axis input
	 *
	 * @param gc
	 */
	protected void xAxisInput(GameContainer gc) {
		if (gc.getInput().isKeyDown(Input.KEY_LEFT) && gc.getInput().isKeyDown(Input.KEY_RIGHT))
			setVelX(0);
		else if (gc.getInput().isKeyDown(Input.KEY_LEFT))
			setVelX(-getSpeed());
		else if (gc.getInput().isKeyDown(Input.KEY_RIGHT))
			setVelX(getSpeed());
		else
			setVelX(0);
	}

	/**
	 * takes in y axis input
	 *
	 * @param gc
	 */
	protected void yAxisInput(GameContainer gc) {
		// different per extension
	}
}
