package PolymorphismDemo;

public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new EmailLogger(),new DatabaseLogger(),new FileLogger(),new ConsoleLogger()};
//        for (BaseLogger logger:loggers){
//            logger.log("Mesaj bir iki");
//        }
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
