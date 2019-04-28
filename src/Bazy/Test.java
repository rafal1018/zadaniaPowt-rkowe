package Bazy;

public class Test {
    public static void main(String[] args) {

        Test test = new Test();

        Oracle oracle = new Oracle();
        Database oracle2 = new Oracle();


        test.saveDataBase(oracle);
        test.saveDataBase(new Oracle());
    }

    public void saveDataBase(Database database){
        database.save();
    }
}
