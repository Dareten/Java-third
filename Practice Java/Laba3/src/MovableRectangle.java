public class MovableRectangle implements Movable{
    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        this.topLeft.ySpeed = Math.abs(this.topLeft.ySpeed);
        this.bottomRight.ySpeed = Math.abs(this.bottomRight.ySpeed);
    }

    @Override
    public void moveDown() {
        this.topLeft.ySpeed = -Math.abs(this.topLeft.ySpeed);
        this.bottomRight.ySpeed = -Math.abs(this.bottomRight.ySpeed);
    }

    @Override
    public void moveLeft() {
        this.bottomRight.xSpeed = -Math.abs(this.bottomRight.xSpeed);
        this.topLeft.xSpeed = -Math.abs(this.topLeft.xSpeed);
    }

    @Override
    public void moveRight() {
        this.bottomRight.xSpeed = Math.abs(this.bottomRight.xSpeed);
        this.topLeft.xSpeed = Math.abs(this.topLeft.xSpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle: top left point (" + this.topLeft.x + ", " + this.topLeft.y +
                "),  bottom right point ("
                + this.bottomRight.x + ", " + this.bottomRight.y
                + ") with xSpeed = " + this.topLeft.xSpeed + " and ySpeed = " + this.topLeft.ySpeed;
    }

    public boolean isSpeedSame(){
        return this.topLeft.xSpeed == this.bottomRight.xSpeed &&
                this.topLeft.ySpeed == this.bottomRight.ySpeed;
    }
}
