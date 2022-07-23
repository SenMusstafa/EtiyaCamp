public class Main {
    public static void main(String[] args){
        CustomerManager customerManager = new CustonerManager();
        CustomerManager customerManager2 = new CustonerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
    }
}
