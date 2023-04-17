
    public class Point {
        private float x = 0.0f;
        private float y = 0.0f;
        public Point() {
        }
        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }
        public float getX() {
            return x;
        }
        public void setX(float x) {
            this.x = x;
        }
        public float getY() {
            return y;
        }
        public void setY(float y) {
            this.y = y;
        }

        public void setXY(float x, float y) {
            this.y = y;
            this.x = x;
        }
        public float[] getXY() {
            float[] out = {this.x, this.y};
            return out;
        }
        @Override
        public String toString() {
            return "+ position: (" + this.x + "," + this.y + ")" + "\n";
        }

    public class MoveAblePoint extends Point {
        private float xSpeed = 0.0f;
        private float ySpeed = 0.0f;


        public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
            super(x, y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public MoveAblePoint() {
        }

        public MoveAblePoint(float[] a) {
            super(a[0], a[1]);
        }

        public MoveAblePoint(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public float getxSpeed() {
            return xSpeed;
        }

        public void setxSpeed(float xSpeed) {
            this.xSpeed = xSpeed;
        }

        public float getySpeed() {
            return ySpeed;
        }

        public void setySpeed(float ySpeed) {
            this.ySpeed = ySpeed;
        }

        public Point move() {
            this.setX(this.getX() + this.xSpeed);
            this.setY(this.getY() + this.ySpeed);
            return this;
        }

        public void setSpeed(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public float[] getSpeed() {
            float[] out = {this.xSpeed, this.ySpeed};
            return out;
        }

        @Override
        public String toString() {
            return super.toString() + "+ speed: (" + this.xSpeed + "," + this.ySpeed + ")" + "\n";
        }
    }
    class run {
            public  static void main(String[] args) {
                Point point1 = new Point(20,30);
                System.out.println(point1.toString());
                point1.setXY(10,20);
                System.out.println(point1.toString());

                point1 = new MoveAblePoint(point1.getX(), point1.getY());
                System.out.println(point1.toString());
                ((MoveAblePoint) point1).move();
                System.out.println(point1.toString());
                MoveAblePoint another = new MoveAblePoint(20,20);
                System.out.println(another.toString());
                another.move();
                System.out.println(another.toString());
            }
        }
}