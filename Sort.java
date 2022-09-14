import java.util.*;



class notebook{

    private int Id;
    private double price;
    private int discount_rate;
    private int Stock;
    private String name;
    private String mark;
    private int Ram;
    private int memory;
    private double Screen_size;


    notebook(int Id, String name,double price,String mark,int memory,double Screen_size,int Ram){

        this.Id=Id;
        this.name=name;
        this.price=price;
        this. mark= mark;
        this.memory=memory;
        this.Screen_size=Screen_size;
        this.Ram=Ram;


    }
    void print(){

        System.out.printf(" |%-4d| %-20s| %-8.1fTL| %-8s| %-8d| %-8.1f| %-14d|\n" ,Id ,  name , price , mark , memory , Screen_size , Ram);

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount_rate() {
        return discount_rate;
    }

    public void setDiscount_rate(int discount_rate) {
        this.discount_rate = discount_rate;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreen_size() {
        return Screen_size;
    }

    public void setScreen_size(int screen_size) {
        Screen_size = screen_size;
    }
}



class phone {

    private int Id;
    private double price;
    private int discount_rate;
    private int Stock;
    private String name;
    private String mark;
    private int memory;
    private double Screen_size;
    private double Battery_Power;
    private int Ram;
    private String colour;
    int camera;

    phone(int Id,String name, double price,String mark, int memory, double Screen_size,int camera,double Battery_Power,int Ram,String colour){

        this.Id=Id;
        this.name=name;
        this.price=price;
        this. mark= mark;
        this.memory=memory;
        this.Screen_size=Screen_size;
        this.Ram=Ram;
        this. camera=camera;
        this.Battery_Power=Battery_Power;
        this.colour=colour;
    }

    void print(){

        System.out.printf(" |%-5d |%-20s| %8.1fTL| %-8s| %-8d| %-8.1f| %-12d| %-8.1f| %-8d| %-20s|\n",Id , name ,price , mark  ,memory
                , Screen_size  , camera , Battery_Power , Ram , colour);



    }



    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount_rate() {
        return discount_rate;
    }

    public void setDiscount_rate(int discount_rate) {
        this.discount_rate = discount_rate;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreen_size() {
        return Screen_size;
    }

    public void setScreen_size(int screen_size) {
        Screen_size = screen_size;
    }

    public double getBattery_Power() {
        return Battery_Power;
    }

    public void setBattery_Power(int battery_Power) {
        Battery_Power = battery_Power;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}


public class Sort {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);


        ArrayList<String> Mark = new ArrayList<>();
        Map<Integer, phone> Phone_product = new HashMap();
        Map<Integer, notebook> notebook_product = new HashMap<>();
        ArrayList<phone> product_phone = new ArrayList<>();
        ArrayList<notebook> product_notebook = new ArrayList<>();


        Mark.add("Samsung");
        Mark.add("Lenovo");
        Mark.add("Apple");
        Mark.add("Huawei,");
        Mark.add("Casper");
        Mark.add(" Asus");
        Mark.add("HP");
        Mark.add("Xiaomi");
        Mark.add("Monster");

        Collections.sort(Mark);

        phone SAMSUNG_A51 = new phone(1, "SAMSUNG GALAXY A51", 3199.0, "Samsung ", 128, 6.5, 32, 4000.0, 6, "Siyah");
        phone iPhone_11_64 = new phone(2, "iPhone 11 64 GB ", 7379.0, "Apple ", 64, 6.1, 5, 3046.0, 6, "mavi");
        phone Redmi_Note_10_pro = new phone(3, "Redmi Note 10 Pro 8GB ", 4012.0, "Xiaomi", 128, 6.5, 35, 4000.0, 12, "Beyaz");
        notebook HUAWEI_Matebook = new notebook(1, "HUAWEI Matebook 14", 7000.0, "Huawei", 512, 14.0, 16);
        notebook LENOVO_V14 = new notebook(2, "LENOVO V14 IGL", 3699.0, "Lenovo", 1024, 14.0, 8);
        notebook ASUS_Tuf = new notebook(3, "ASUS Tuf Gaming ", 8199.0, "Asus", 2048, 15.6, 32);



        Phone_product.put(SAMSUNG_A51.getId(), SAMSUNG_A51);
        Phone_product.put(iPhone_11_64.getId(), iPhone_11_64);
        Phone_product.put(Redmi_Note_10_pro.getId(), Redmi_Note_10_pro);
        notebook_product.put(HUAWEI_Matebook.getId(), HUAWEI_Matebook);
        notebook_product.put(LENOVO_V14.getId(), LENOVO_V14);
        notebook_product.put(ASUS_Tuf.getId(), ASUS_Tuf);

        product_phone.add(SAMSUNG_A51);
        product_phone.add(iPhone_11_64);
        product_phone.add(Redmi_Note_10_pro);

        product_notebook.add(HUAWEI_Matebook);
        product_notebook.add(LENOVO_V14);
        product_notebook.add(ASUS_Tuf);


        int chose;
        do {

            System.out.println("Patika Store Ürün Yönetim Paneli !");
            System.out.println(" 1-Notebook İşlemler \n 2-Cep Telefonu İşlemlerileri \n 3 - Marka Listele \n 4-Diğer işlemler  \n 0- Çıkış Yap");

            System.out.print("Tercihiniz :");
            chose = input.nextInt();


            switch (chose) {

                case 1:

                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println(" | ID  | Ürün Adı          | Fiyat    | Marka    | Depolama  |  Ekran    | RAM      |");
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    for (notebook i : notebook_product.values()) {

                        i.print();

                    }

                    System.out.println("------------------------------------------------------------------------------------------------------");

                    break;

                case 2:
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| ID    |  Ürün Adı     | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil  | RAM   | Renk            |");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
                    for (phone i : Phone_product.values()) {

                        i.print();
                    }

                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
                    break;

                case 3:

                    System.out.println("Hangi markadan ürün görmek istersiniz?");
                    System.out.println("-Apple \n - Asus \n - Casper \n - HP  \n- Huawei  \n- Lenovo \n " +
                            "- Monster \n - Samsung  \n- Xiaomi");
                    String chose5=input.next();



                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("| ID    |  Ürün Adı     | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil  | RAM   | Renk            |");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

                        for (int i = 0; i < product_phone.size(); i++) {

                            if (product_phone.get(i).getMark().equals(chose5)) {

                                product_phone.get(i).print();
                            }

                            if (product_notebook.get(i).getMark().equals(chose5)) {

                                product_notebook.get(i).print();

                            }
                        }


                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

                    break;
                case 4:

                    System.out.println("1.Ürün ekle \n 2.Ürün sil");
                    int chose2= input.nextInt();
                    if(chose2==1){
                        System.out.println("Hangi ürün grubuna ekleme yapmak istersiniz");
                        System.out.println("1.notebook\n 2.Phone");
                        int chosen3= input.nextInt();
                        if(chosen3==1){

                            System.out.println("Ürünün Id ,  name , price , mark , memory , Screen_size , Ram olmak üzere değerlerini giriniz");
                            notebook comp=new notebook( input.nextInt(),input.next(),
                                    input.nextDouble(),input.next(),input.nextInt(),input.nextDouble(),input.nextInt());

                            notebook_product.put(comp.getId(),comp);
                        }

                        else{

                            System.out.println("ürünün Id , name ,price , mark  ,memory , Screen_size  , camera , Battery_Power , Ram , colour olmak üzere değerlerini giriniz");
                            phone phone=new phone(input.nextInt(),input.next(),input.nextDouble(),input.next(),input.nextInt(),
                                    input.nextDouble(),input.nextInt(),input.nextDouble(),input.nextInt(),input.next());

                            Phone_product.put(phone.getId(),phone);
                        }
                    }

                    else{
                        System.out.println("hangi ürünü silmek istersiniz");
                        System.out.println("1.notebook\n 2.Phone");
                        int chosen4= input.nextInt();
                        if(chosen4==1){

                            System.out.println("Silmek istediğiniz ürünün Id sini giriniz");
                            notebook_product.keySet().remove(input.nextInt());

                        }

                        else{

                            System.out.println("Silmek istediğiniz ürünün Id sini giriniz");
                            Phone_product.keySet().remove(input.nextInt());

                        }

                    }

                    break;

                case 0:

                    System.out.println("Patika Store'da tekrar görüşmek dileğiyle");
                    System.exit(0);
            }

        }

        while (true);


    }
}






