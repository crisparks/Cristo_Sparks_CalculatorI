public class CalculatorTest {

	public static void main(String[] args) {
		Calculator test1 = new Calculator(10.5,"+",5.2);
		Calculator test2 = new Calculator(50.4,"-",20.2);
		test1.performOperation();
		test1.getResults();
		test2.performOperation();
		test2.getResults();
	}
}