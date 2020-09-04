public class MovablePoint implements Movable{
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        ySpeed = Math.abs(ySpeed);
    }

    @Override
    public void moveDown() {
        ySpeed = -Math.abs(ySpeed);
    }

    @Override
    public void moveLeft() {
        xSpeed = -Math.abs(xSpeed);
    }

    @Override
    public void moveRight() {
        xSpeed = Math.abs(xSpeed);
    }

    @Override
    public String toString() {
        return "MovablePoint on (" + this.x + ", " + this.y + ")" + " with xSpeed = "
                + this.xSpeed + ", ySpeed = " + this.ySpeed;
    }
}
