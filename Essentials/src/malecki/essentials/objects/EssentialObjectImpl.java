/**
 * Copyright (c) Feb 21, 2017 Daniel E. Malecki
 * All rights reserved.
 */
package malecki.essentials.objects;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 * essential game object logic
 *
 * @author dmalecki
 */
public class EssentialObjectImpl extends EssentialValues implements EssentialObject {

	/**
	 * sets basic values
	 *
	 * @param ORIGx1
	 * @param ORIGy1
	 * @param ORIGx2
	 * @param ORIGy2
	 * @param ORIGvelX
	 * @param ORIGvelY
	 * @throws SlickException
	 */
	public EssentialObjectImpl(float ORIGx1, float ORIGy1, float ORIGx2, float ORIGy2)
			throws SlickException {
		super(ORIGx1, ORIGy1, ORIGx2, ORIGy2);
		initialize();
	}

	/**
	 * initializes object
	 */
	private void initialize() {
		setX1(getORIGx1());
		setY1(getORIGy1());
		setX2(getORIGx2());
		setY2(getORIGy2());
		setHeight();
		setWidth();
		setVelX(getORIGvelX());
		setVelY(getORIGvelY());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void render(GameContainer gc, Graphics g) {
		getImage().draw(getX1(), getY1(), getWidth(), getHeight());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void update(GameContainer gc, int t) throws SlickException {
		positionUpdate();
		boundaryDetection(gc.getWidth(), gc.getHeight());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void reset() {
		setX1(getORIGx1());
		setX2(getORIGx2());
		setY1(getORIGy1());
		setY2(getORIGy2());
		setWidth();
		setWidth();
		setVelX(getORIGvelX());
		setVelY(getORIGvelY());
	}

	/**
	 * detects this object's collision with any other objects
	 *
	 * @param cv
	 * @return if collision is detected
	 * @throws SlickException
	 */
	protected boolean collide(EssentialValues cv) throws SlickException {
		// collision on right
		if (getX2() > cv.getX1())
			return true;
		// collision on bottom
		if (getY2() > cv.getY1())
			return true;
		// collision on left
		if (getX1() < cv.getY2())
			return true;
		// collision on top
		if (getY1() < cv.getY2())
			return true;
		return false;
	}

	/**
	 * sets the x2 and y2 coordinates based on width and height
	 */
	protected void positionUpdate() {
		setX1(getX1() + getVelX());
		setY1(getY1() + getVelY());
		matchSecondCoordinate();
	}

	/**
	 * updates second coordinate based on first coordinate
	 */
	protected void matchSecondCoordinate() {
		setX2(getX1() + getWidth());
		setY2(getY1() + getWidth());
	}

	/**
	 * boundary logic
	 * note: can be overridden for objects that go off screen
	 */
	protected void boundaryDetection(int screenWidth, int screenHeight) {
		if (getX1() < 0)
			setX1(0);
		if (getX2() > screenWidth)
			setX1(screenWidth - getWidth());
		if (getY1() < 0)
			setY1(0);
		if (getY2() > screenHeight)
			setY1(screenHeight - getHeight());
		matchSecondCoordinate();
	}
}
