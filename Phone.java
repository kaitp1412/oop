 abstract class Mobile {
    public abstract String DownloadApp();
}
class Iphone extends Mobile{
    @Override
    public String DownloadApp(){
        return "Download app in appleStore" ;
    }
}
class Nokia extends Mobile{
    @Override
    public String DownloadApp(){
        return "Download app in CH Play" ;
    }
}
class DienThoai{
    public static void main(String[] args) {
        Mobile [] mobiles = new Mobile[2];
        mobiles[0] = new Iphone();
        mobiles[1] = new Nokia();
        for (Mobile mobile : mobiles){
            System.out.println(mobile.DownloadApp());
        }
    }
}