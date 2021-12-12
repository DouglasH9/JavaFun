package fizzbuzz;
    
public class FizzBuzz {
    public String fizzBuzz(int number){
        if (number % 5 == 0 && number % 3 == 0){
            return "FizzBuzz!";
        }
        else if (number % 5 == 0){
            return "Buzz!";
        }
        else if (number % 3 == 0){
            return "Fizz!";
        }
        else{
            return Integer.toString(number);
        }
    }

    public String fizzBuzz(int number, String multOf3Word, String multOf5Word, String multOf15Word){
        if (number % 5 == 0 && number % 3 == 0){
            return multOf15Word;
        }
        else if (number % 5 == 0){
            return multOf5Word;
        }
        else if (number % 3 == 0){
            return multOf3Word;
        }
        else{
            return Integer.toString(number);
        }
    }
}
