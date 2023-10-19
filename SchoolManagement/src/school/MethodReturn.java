package school;

public class MethodReturn {
	
	int number1;
	int number2;
	int multiply;
    
	int Multiplication() {
		multiply = number1* number2;
		return multiply;
	}

	public static void main(String[] args) {
		MethodReturn m = new MethodReturn();
		m.number1 = 13;
		m.number2 = 10;
		System.out.println(m.Multiplication());
		Sum method = new Sum();
		method.num1=10;
		method.num2= 23;
		method.num3 = 15;
		System.out.println(method.AddNumbers());

	}

}
