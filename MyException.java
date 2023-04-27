
class MyException extends Exception {
    public MyException(String s)
    {
// Gọi constructor của Exception cha
        super(s);
    }
}

// Một lớp sử dụng MyException ở trên
class Mail {

    //Chương trình điều khiển
    public static void main(String args[])
    {
        try {
            // Ném một đối tượng của ngoại lệ do người dùng xác định
            throw new MyException("GeeksGeeks");
        }
        // bắt ngoại lệ
        catch (MyException ex) {
            System.out.println("Caught");

            // In thông báo từ đối tượng MyException
            System.out.println(ex.getMessage());
        }
    }

}

// Gồm 2 lớp :
//   Lớp kế thừa : dùng để Gọi constructor của Exception cha
//   Lớp Main : Dùng để in ra kết mả hiển thị

// vì lệnh trong try đã rơi vào trường hợp ngoại lệ nên in trường hợp catch và try
