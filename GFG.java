
class GFG {
    public static void main (String[] args)
    {

        String s = "";
        try {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e) {
            System.out.println("IllegalArgumentException bị bắt");
        }
        s = "GeeksforGeeks";
        try {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e) {
            System.out.println("IllegalArgumentException bị bắt");
        }
        s = null;
        try {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e) {
            System.out.println("IllegalArgumentException bị bắt");
        }
    }
    public static int getLength(String s) {
        if (s == null)
            throw new IllegalArgumentException("Đối số không thể là null");
        return s.length();
    }
}
// B2 : Lấy độ dài ở kí tự s ;


//B3 :  Chương trình trên in ra kết quả là
//0
//13
//IllegalArgumentException bị bắt

//B4 : Ngoại lệ IllegalArgumentException xảy ra khi tham số đầu vào không hợp lệ;