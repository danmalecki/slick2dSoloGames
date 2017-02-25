/**
 * Copyright (c) Feb 22, 2017 Daniel E. Malecki
 * All rights reserved.
 */
package malecki.essentials.player;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

import malecki.essentials.objects.EssentialObjectImpl;

/**
 * essential logic shared by all players
 *
 * @author dmalecki
 */
public class EssentialPlayer extends EssentialObjectImpl {

	/**
	 * sets the basic values
	 *
	 * @param ORIGx1
	 * @param ORIGy1
	 * @param ORIGx2
	 * @param ORIGy2
	 * @param ORIGvelX
	 * @param ORIGvelY
	 * @throws SlickException
	 */
	public EssentialPlayer(float ORIGx1, float ORIGy1, float ORIGx2, float ORIGy2)
			throws SlickException {
		super(ORIGx1, ORIGy1, ORIGx2, ORIGy2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void update(GameContainer gc, int t) throws SlickException {
		checkInput(gc);
		positionUpdate();
		boundaryDetection(gc.getWidth(), gc.getHeight());
	}

	/**
	 * checks for input
	 *
	 * @param gc
	 */
	protected void checkInput(GameContainer gc) {
		// input based on extensions
	}
}
