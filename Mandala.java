import edu.cymbal.graphics.*;

public class Mandala {

    private static CanvasAPI canvas;
    private static PainterAPI p;

    public static void main(String[] args) {
        canvas = Graphics.createCanvas(800, 600, "My Mandala");
        p = canvas.getPainter();

        // Test the drawing setup using three different PainterAPI methods.
        p.forward(80);
        p.turnRight(90);
        p.circle(40);
    }

    /**
     * Draws the complete design: a central mandala surrounded
     * by smaller shapes of different sizes.
     */
    public static void drawDesign() {
        // Calls drawCentralMandala.
        // Calls drawSurroundingShapes.
    }

    /**
     * Draws overlapping circles and squares centered at (0, 0).
     */
    public static void drawCentralMandala() {
        // Calls drawCircle.
        // Calls drawSquare.
    }

    /**
     * Draws small circles, squares, and triangles of different
     * sizes around the central mandala.
     */
    public static void drawSurroundingShapes() {
        // Calls drawCircle.
        // Calls drawSquare.
        // Calls drawTriangle.
    }

    /**
     * Draws a circle centered at the specified position.
     *
     * @param x the X coordinate of the center
     * @param y the Y coordinate of the center
     * @param radius the radius of the circle
     */
    public static void drawCircle(int x, int y, int radius) {
    }

    /**
     * Draws a square with sides parallel to the canvas edges.
     *
     * @param x the X coordinate of the bottom-left corner
     * @param y the Y coordinate of the bottom-left corner
     * @param sideLength the length of each side
     */
    public static void drawSquare(int x, int y, int sideLength) {
    }

    /**
     * Draws an equilateral triangle pointing upward.
     *
     * @param x the X coordinate of the left endpoint of the base
     * @param y the Y coordinate of the base
     * @param sideLength the length of each side
     */
    public static void drawTriangle(int x, int y, int sideLength) {
    }
}