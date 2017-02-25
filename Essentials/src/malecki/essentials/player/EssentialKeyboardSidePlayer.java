/**
 * Copyright (c) Feb 23, 2017 Daniel E. Malecki
 * All rights reserved.
 */
package malecki.essentials.player;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

/**
 * essential logic for a side view keyboard controlled player
 *
 * @author dmalecki
 */
public class EssentialKeyboardSidePlayer extends EssentialKeyboardPlayer {

	protected float gravity, vertical;

	/**
	 * sets basic values
	 *
	 * @param ORIGx1
	 * @param ORIGy1
	 * @param ORIGx2
	 * @param ORIGy2
	 * @throws SlickException
	 */
	public EssentialKeyboardSidePlayer(float ORIGx1, float ORIGy1, float ORIGx2, float ORIGy2)
			throws SlickException {
		super(ORIGx1, ORIGy1, ORIGx2, ORIGy2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void yAxisInput(GameContainer gc) {
		ceilingCollision();
		// account for gravity
		setVelY(getVelY() + gravity);
		if (!inAir(gc))
			if (gc.getInput().isKeyDown(Input.KEY_UP))
				setVelY(vertical);
	}

	/**
	 * detects if this player is colliding with the ceiling
	 */
	private void ceilingCollision() {
		if (getY1() <= 0 && getVelY() < 0)
			setVelY(0);
	}

	/**
	 * checks to see if player is not on the bottom of the screen
	 *
	 * @param gc
	 * @return if object is in the air
	 */
	private boolean inAir(GameContainer gc) {
		if (getY2() >= gc.getHeight())
			return false;
		return true;
	}
}
