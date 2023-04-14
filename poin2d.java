public class d2 {
    private float x=0.0f;
    private float y=0.0f;

    public d2(float x, float y){
        this.x=x;
        this.y=y;
    }

    public d2(){

    }

    public float getX(){
        return this.x;
    }

    public void setX(float x){
        this.x=x;
    }

    public float getY(){
        return this.y;
    }

    public void setY(float y){
        this.y=y;
    }

    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        float[] test=new float[2];
        test[0]=this.x;
        test[1]=this.y;
        return test;
    }

    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }

}
     class d3 extends d2{

        private float z=0.0f;

        public d3 (float x, float y, float z){
            super(x, y);
            this.z=z;
        }

        public d3(){
        }

        public float getZ(){
            return this.z;
        }

        public void setZ(float z){
            this.z=z;
        }

        public void setXYZ(float x, float y, float z){
            setXY(x, y);
            this.z=z;
        }

        public float[] getXYZ(){
            float[] test=new float[3];
            test[0]=this.z;
            test[1]=this.z;
            test[2]=this.z;
            return test;
        }

        @Override
        public String toString(){
            return "("+getX()+","+getY()+","+getZ()+")";
        }

    }
 class Exercised2Andd3 {
    public static void main(String[] args) {
        d2 firstd2=new d2(3, 4);
        d3 firstd3=new d3(6, 5,7);

        System.out.println(firstd2.toString());
        System.out.println(firstd3.toString());
    }

}



