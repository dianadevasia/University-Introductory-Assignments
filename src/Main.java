import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dianadevasia on 18/02/15.
 */

public class Main {
    public static void main(String s[]) throws IOException {
        Main mainObj = new Main();
        mainObj.horizontalLine();
        mainObj.verticalLine();
        mainObj.rightTriangle();
        mainObj.fizzBuzz();
        mainObj.primeFactors();
        mainObj.isoscelesTriangle();
        mainObj.diamond();
        mainObj.diamondWithName();
    }

    private int GetUserInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    public void horizontalLine() throws IOException{
        System.out.println("Enter no of stars");
        Integer numberOfLines = GetUserInput();
        for (int number = 1; number <= numberOfLines; number++) {
            System.out.print("*");
        }
    }

    public void verticalLine() throws IOException{
        System.out.println("Enter no of lines");
        Integer numberOfLines = GetUserInput();
        for (int number = 1; number <= numberOfLines; number++)
            System.out.println("*");
    }

    public void rightTriangle() throws IOException{
        System.out.println("Enter no of lines");
        Integer numberOfLines = GetUserInput();
        for (int lineNumber = 0; lineNumber < numberOfLines; lineNumber++)
        {
            for (int starCount = 0; starCount <= lineNumber; starCount++)
                System.out.print("*");
            System.out.println();
        }
    }

    public void generateUpperTriangle(int numberOfLines){
        int number=1;
        while (numberOfLines >= 0)
        {
            for (int x = 0; x < numberOfLines; x++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= (2 * number) - 1; x++)
                System.out.print("*");
            numberOfLines--;
            number++;
            System.out.println();
        }
    }
    public void isoscelesTriangle() throws IOException {
        Integer numberOfLines = GetUserInput();
        generateUpperTriangle(numberOfLines);
    }

    private void generateDownDiamond(int i)
    {
        int j=i;
        int k=i;
        int z=i;
        while (z > 0)
        {
            for (int x = i; x >= k; x--) {
                System.out.print(" ");
            }

            for (int x = 1; x <= (2 * j) - 1; x++)
                System.out.print("*");
            z--;
            j--;
            k--;
            System.out.println();
        }
    }

    public void diamond() throws IOException
    {
        System.out.println("Enter no of lines");
        Integer numberOfLines = GetUserInput();

        generateUpperTriangle(numberOfLines);
        generateDownDiamond(numberOfLines-1);
    }

    public void diamondWithName()throws IOException
    {
        System.out.println("Enter no of lines");
        Integer numberOfLines = GetUserInput();

        System.out.println("Enter the name");
        String name = new BufferedReader(new InputStreamReader(System.in)).readLine();

        generateUpperTriangleWithName(numberOfLines,name);

        generateDownDiamond(numberOfLines-1);
    }

    private void generateUpperTriangleWithName(int numberOfLines,String name) {
        int j=1;
        while (numberOfLines > 0)
        {
            for (int x = 0; x < numberOfLines; x++) {
                System.out.print(" ");
            }

            for (int x = 1; x <= (2 * j) - 1; x++)
                System.out.print("*");
            numberOfLines--;
            j++;
            System.out.println();
        }
        System.out.println(name);
    }


    public void fizzBuzz() throws IOException{
        for(int number=1;number<=100;number++){
            if(number% 3 ==0 && number%5 == 0)
                System.out.println("FizzBuzz");
            else if(number%3 == 0 )
                System.out.println("Fizz");
            else if(number% 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(number);
        }
    }

    public void primeFactors() throws IOException{
        System.out.println("Enter no");
        int enteredNumber = GetUserInput();
        int number=2;
        while(number < (enteredNumber / 2))
        {
            if(enteredNumber% number==0){
                if(number==2)
                    System.out.println(number);
                else if(number%2 != 0)
                    System.out.println(number);
            }
            number++;
        }
    }
}
