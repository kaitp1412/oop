class NullPointerException1 {
    public static void main (String[] args)
    {
        // Initializing String variable with null value
        String ptr = null;

        // Checking if ptr is null using try catch.
        try
        {
            if ("gfg".equals(ptr))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }
    }

}


//Bước 1 : Bị lỗi ; Vì thiếu dấu ngoặc nhọn ({}) và dấu chấm phẩy (;)
//Bước 2 : Code in ra (NullPointerException Caught) vì giá trị sảy ra đang rỗng
//Bước 3 : NullPointerException xảy ra khi một tham chiếu có giá trị là null
//Bước 4 : Code in ra (Not same )vì đối tượng so sánh là chuỗi kí tự không phải là null nên k thể sảy ra trường hợp là null đc