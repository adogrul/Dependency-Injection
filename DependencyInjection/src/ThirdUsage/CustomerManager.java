package ThirdUsage;

class CustomerManager {
   private ICustomerDAL iCustomerDAL;
   public CustomerManager(ICustomerDAL iCustomerDAL){
       this.iCustomerDAL = iCustomerDAL;
   }
   public void add(){
       iCustomerDAL.add();
   }
}
