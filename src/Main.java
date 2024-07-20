//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * This project aims to help you practice while learning Java.
 * @author Resat Yavcin
 * @since 2024-07-07
*/

public class Main {
    public static void main(String[] args) {
        TestConstructor tst = new TestConstructor();
        tst.printValue();

        TestConstructor tst2 = new TestConstructor("Helllo", 12.f);
        tst2.printValue();

        //Hata veriyor çünkü default constructor arıyor fakat o bir func.
        //EmployeeTestConstructor emp = new EmployeeTestConstructor();

        DRYTestConstructor tt = new DRYTestConstructor();
        tt.printValue();

        //yeni bir nesne dönderir.
        tt.copy();

        //aynı nesneyi artırır ve döner
        tt.grow().grow().printValue();


        TypeTest typeTest = new TypeTest();
        typeTest.getAsciiChar();


    }
}