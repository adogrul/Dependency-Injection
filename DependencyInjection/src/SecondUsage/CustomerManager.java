package SecondUsage;

class CustomerManager {

    public void add(){
        CustomerDAL customerDAL = new CustomerDAL();
        customerDAL.add(1);
    }
}
