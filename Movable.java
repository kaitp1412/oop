
    public interface Movable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }
    class MovablPoint implements Movable{
        int x ;
        int y ;
        int xSpeed;
        int ySpeed;
        public MovablPoint(int x , int y , int xSpeed , int ySpeed ){
            this.x = x ;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }
        @Override
        public String toString(){
            return "(x " + x + " , y " + y + ") speed ( x " + xSpeed + " y  " + ySpeed + ")" ;
        }
        @Override
        public void moveUp(){
            y -= ySpeed;
        }
        @Override
        public void moveDown(){
            y += ySpeed;
        }
        @Override
        public void moveLeft(){
            x -= xSpeed;
        }
        @Override
        public void moveRight(){
            x += xSpeed;
        }
}

    class MovableCircle extends MovablPoint implements Movable {
        private int radius;
        private MovablPoint center;
        public MovableCircle(int x , int y , int xSpeed , int ySpeed , int radius){
            super(x,y,xSpeed,ySpeed);
            center = new MovablPoint(x,y,xSpeed,ySpeed);
            this.radius = radius;
        }
        @Override
        public String toString(){
            return "( x " + x + " y " + y + ") speed (xSpeed " + xSpeed + " ySpeed " + ySpeed + ") radius " + radius;
        }
        @Override
        public void moveUp(){
            center.moveUp();
        }
        @Override
        public void moveDown(){
            center.moveDown();
        }
        @Override
        public void moveLeft(){
            center.moveLeft();
        }
        @Override
        public void moveRight(){
            center.moveRight();
        }
    }
