package SecondUsage;

class CustomerDAL {
    // If I add MySQL Database on my system I need to use if-else. This build creates spaghetti codes in the future
    public void add(int type){
        if (type == 1){
            System.out.println("Added Oracle Database");
        }else {
            System.out.println("Added MySQL Database");
        }
    }
}
