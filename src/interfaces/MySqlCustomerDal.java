package interfaces;

public class MySqlCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void add() {
        System.out.println("MySql e eklendi..");
    }
}