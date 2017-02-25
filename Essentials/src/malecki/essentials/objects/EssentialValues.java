/**
 * Copyright (c) Feb 22, 2017 Daniel E. Malecki
 * All rights reserved.
 */
package malecki.essentials.objects;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 * POJO for essential game values
 *
 * @author dmalecki
 */
public class EssentialValues {

	private float x1, y1, x2, y2, width, height, velX, velY, speed;
	private final float ORIGx1, ORIGy1, ORIGx2, ORIGy2, ORIGvelX, ORIGvelY, directionUpLeft,
			directionDownRight;
	private Image image;

	/**
	 * sets the original values
	 *
	 * @param oRIGx1
	 * @param oRIGy1
	 * @param oRIGx2
	 * @param oRIGy2
	 * @param oRIGvelX
	 * @param oRIGvelY
	 * @throws SlickException
	 */
	public EssentialValues(float oRIGx1, float oRIGy1, float oRIGx2, float oRIGy2)
			throws SlickException {
		ORIGx1 = oRIGx1;
		ORIGy1 = oRIGy1;
		ORIGx2 = oRIGx2;
		ORIGy2 = oRIGy2;
		ORIGvelX = 0;
		ORIGvelY = 0;
		directionUpLeft = -1;
		directionDownRight = 1;
	}

	/**
	 * @return the x1
	 */
	public float getX1() {
		return x1;
	}

	/**
	 * @param x1 the x1 to set
	 */
	public void setX1(float x1) {
		this.x1 = x1;
	}

	/**
	 * @return the y1
	 */
	public float getY1() {
		return y1;
	}

	/**
	 * @param y1 the y1 to set
	 */
	public void setY1(float y1) {
		this.y1 = y1;
	}

	/**
	 * @return the x2
	 */
	public float getX2() {
		return x2;
	}

	/**
	 * @param x2 the x2 to set
	 */
	public void setX2(float x2) {
		this.x2 = x2;
	}

	/**
	 * @return the y2
	 */
	public float getY2() {
		return y2;
	}

	/**
	 * @param y2 the y2 to set
	 */
	public void setY2(float y2) {
		this.y2 = y2;
	}

	/**
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * sets the width variable
	 */
	public void setWidth() {
		width = x2 - x1;
	}

	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * sets the height variable
	 */
	public void setHeight() {
		height = y2 - y1;
	}

	/**
	 * @return the velX
	 */
	public float getVelX() {
		return velX;
	}

	/**
	 * @param velX the velX to set
	 */
	public void setVelX(float velX) {
		this.velX = velX;
	}

	/**
	 * @return the velY
	 */
	public float getVelY() {
		return velY;
	}

	/**
	 * @param velY the velY to set
	 */
	public void setVelY(float velY) {
		this.velY = velY;
	}

	/**
	 * @return the oRIGx1
	 */
	public float getORIGx1() {
		return ORIGx1;
	}

	/**
	 * @return the oRIGy1
	 */
	public float getORIGy1() {
		return ORIGy1;
	}

	/**
	 * @return the oRIGx2
	 */
	public float getORIGx2() {
		return ORIGx2;
	}

	/**
	 * @return the oRIGy2
	 */
	public float getORIGy2() {
		return ORIGy2;
	}

	/**
	 * @return the oRIGvelX
	 */
	public float getORIGvelX() {
		return ORIGvelX;
	}

	/**
	 * @return the oRIGvelY
	 */
	public float getORIGvelY() {
		return ORIGvelY;
	}

	/**
	 * @return the image
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(Image image) {
		this.image = image;
	}

	/**
	 * @return the speed
	 */
	public float getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(float speed) {
		this.speed = speed;
	}

	/**
	 * @return the directionUpLeft
	 */
	public float getDirectionUpLeft() {
		return directionUpLeft;
	}

	/**
	 * @return the directionDownRight
	 */
	public float getDirectionDownRight() {
		return directionDownRight;
	}
}
