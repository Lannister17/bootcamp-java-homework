package overRiding;

public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] baseCreditManagers= new BaseCreditManager[]
                {new TeacherCreditManager(),new FarmerCreditManager(),new StudentCreditManager()};

        for (BaseCreditManager baseCreditManager:baseCreditManagers){
            System.out.println(baseCreditManager.calculate(1000));
        }
    }


}
