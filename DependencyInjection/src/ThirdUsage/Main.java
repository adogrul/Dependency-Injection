package ThirdUsage;

class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDAL());
        customerManager.add();

        CustomerManager customerManager1 = new CustomerManager(new MySqlCustomerDAL());
        customerManager1.add();
    }
}
/*
* We can use MySQL and Oracle Database
* but still our main class is dependent on other classes.
* The biggest difference between FirstUsage and ThirdUsage
* is that in FirstUsage the dependencies are much tighter and not innovative,
* but in ThirdUsage the dependencies are less and when we add a new database,
* all we have to do is create a new class and get rid of possible if-else blocks.
* */
