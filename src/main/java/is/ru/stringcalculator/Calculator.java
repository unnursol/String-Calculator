package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",") | text.contains("\n")){
		  String[] numbers = text.split(",|\n");
		  return sum(numbers);
		}
		else
			return 1;
	}

	private static int sum(String[] numbers){
		String[] negNumbers = new String[]{};
		int total = 0;
		for(String number : numbers){
			int n = Integer.parseInt(number);
			if(n < 0){
				//negNumbers.add(number);
			}
			else if(n <= 1000){
				total += Integer.parseInt(number);
			}
		}
		return total;
	}
}
