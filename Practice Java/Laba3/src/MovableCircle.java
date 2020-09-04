public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        this.center.ySpeed = Math.abs(this.center.ySpeed);
    }

    @Override
    public void moveDown() {
        this.center.ySpeed = -Math.abs(this.center.ySpeed);
    }

    @Override
    public void moveLeft() {
        this.center.xSpeed = -Math.abs(this.center.xSpeed);
    }

    @Override
    public void moveRight() {
        this.center.xSpeed = Math.abs(this.center.xSpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle on (" + this.center.x + ", " + this.center.y +
                ")" + " with xSpeed = "
                + this.center.xSpeed + ", ySpeed = " + this.center.ySpeed
                + " with radius = " + this.radius;
    }
}
