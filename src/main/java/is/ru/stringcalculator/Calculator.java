package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text) throws Exception{
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",") | text.contains("\n")){
			/*if(text.startsWith("//")){
				return changedDelimSum(text);
			}*/
		  String[] numbers = text.split(",|\n");
		  return sum(numbers);
		}
		else
			return 1;
	}

	private static int sum(String[] numbers) throws Exception{
		int total = 0;
		for(String number : numbers){
			int n = Integer.parseInt(number);
			if(n < 0){
				throw new Exception ("Negatives not allowed: " + negString(numbers));
			}
			else if(n <= 1000){
				total += Integer.parseInt(number);
			}
		}
		return total;
	}

	private static String negString(String[] numbers){
		String negNumbers = new String();
		for(String number : numbers){
			int n = Integer.parseInt(number);
			if(n < 0){
				negNumbers += number + ",";
			}
		}
		return negNumbers.substring(0, negNumbers.length()-1);
	}
/*
	private static int changedDelimSum(String text){
    int delimiterIndex = text.indexOf("//") + 2;
    String delimiter = text.substring(delimiterIndex, delimiterIndex + 1);
		String numbersWithoutDelimiter = text.substring(text.indexOf("n") + 1);
		String[] numbers = numbersWithoutDelimiter.split(delimiter);
    return sum(numbers);
	}
*/
}
