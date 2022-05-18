/**
 * Represents a "Thing" that will be hidden on the board by the AIPlayer.
 *
 * @author Ms Caitlin Woods
 * @version April 2022
 * 
 * Student Names and Numbers: { ENTER YOUR STUDENT NAME AND NUMBER HERE  }
 */

import java.awt.Color;
import java.util.Arrays;

public class Item {

    private String type; // a string representing the type of the object, i.e. "phone" or "book".
    private int[][] shape; // a 2D array representing the shape of the object. hint: you can assume that 
                           //this is a square array where 1 represents an item piece and
                           // 0 represent an empty space.
    private Integer locationX; // the x location of of the shape (i.e. shape[0][0] is at locationX).
    private Integer locationY; // the x location of of the shape (i.e. shape[0][0] is at locationY).
    private boolean isFound; // a boolean representing whether or not a Item has been found by the player.

    /**
     * Constructor for the Item class
     * Initializes the instance varables.
     * hint: initialise locationX and locationY to -1
     */
    public Item(String type, int[][] shape) {
        this.type = type;
        this.shape = shape;
        locationX = -1;
        locationY = -1;
        isFound = false;
    }

    /**
     * Returns the type of the item
     * @return the type of the item
     */
    public String getType() {
        return type;
    }

    /**
     * Returns the shape of the item
     * @return the shape of the item
     */
    public int[][] getShape() {
        return shape;
    }

    /**
     * Sets the shape of an iem to a new shape
     * @return the shape
     */
    public void setShape(int[][] newShape) {
        shape = newShape;
    }

    /**
     * Sets the state of the item to "found"
     */
    public void setFound() {
        isFound = true;
    }

    /**
     * Returns whether or not the item has been found by the player
     * @return true if the item has been found, false otherwise
     */
    public boolean getIsFound() {
        if (isFound == false) {
            return false; 
        }
        else {return true; 
        }
    }

    /**
     * Returns the x location of the item
     * @return the x location of the item
     */
    public int getLocationX() {
        return locationX;
    }

    /**
     * Returns the y location of the item
     * @return the y location of the item
     */
    public int getLocationY() {
        return locationY;
    }

    /**
     * Sets the x and y locations for the item.
     * @param xloc the x location
     * @param yloc the y location
     */
    public void setLocation(int xloc, int yloc) {
        locationX = xloc;
        locationY = yloc;
    }

    /**
     * Rotates the item (i.e. its shape) 90 degrees clockwise and sets the shape of the item as the
     * new rotated array.
     */
    public void rotate90Degrees() {
        int M = shape.length;
        int N = shape[0].length;
        int[][] ret = new int[N][M];
        for (int i = 0; i < M; i++) {
            for (int c = 0; c < N; c++) {
                ret[c][M-1-i] = shape[i][c];
            }
        }
        shape = ret;
    }
}
