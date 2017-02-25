/**
 * Copyright (c) Feb 23, 2017 Daniel E. Malecki
 * All rights reserved.
 */
package malecki.essentials.player;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

/**
 * essential logic for a top view keyboard controlled player
 *
 * @author dmalecki
 */
public class EssentialKeyboardTopPlayer extends EssentialKeyboardPlayer {

	/**
	 * sets basic values
	 *
	 * @param ORIGx1
	 * @param ORIGy1
	 * @param ORIGx2
	 * @param ORIGy2
	 * @throws SlickException
	 */
	public EssentialKeyboardTopPlayer(float ORIGx1, float ORIGy1, float ORIGx2, float ORIGy2)
			throws SlickException {
		super(ORIGx1, ORIGy1, ORIGx2, ORIGy2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void yAxisInput(GameContainer gc) {
		if (gc.getInput().isKeyDown(Input.KEY_UP) && gc.getInput().isKeyDown(Input.KEY_DOWN))
			setVelY(0);
		else if (gc.getInput().isKeyDown(Input.KEY_UP))
			setVelY(-getSpeed());
		else if (gc.getInput().isKeyDown(Input.KEY_DOWN))
			setVelY(getSpeed());
		else
			setVelY(0);
	}
}
