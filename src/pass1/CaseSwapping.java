package pass1;

import java.util.Scanner;

public class CaseSwapping {

    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new CaseSwapping().Program();
    }

    void Program() {

        String input = "a";
        while (!input.equals("n")) {
            input = sc.nextLine();
            String caseSwappedStr = swapCase(input);
            System.out.println(caseSwappedStr);
        }

    }

    String swapCase(String original) {
        String swapped = "";
        for (int i = 0; i < original.length(); i++) {
            char character = original.charAt(i);

            if (isLowerCaseChar(character)) {
                character += 'A' - 'a';

            } else if (isUpperCaseChar(character)) {
                character -= 'A' - 'a';
            }

            swapped += character;
        }

        return swapped;
    }


    boolean isCharacter(char character) {
        return isUpperCaseChar(character) ||isLowerCaseChar(character);
    }

    boolean isUpperCaseChar(char character) {
        return character >= 'A' && character <= 'Z';
    }

    boolean isLowerCaseChar(char character) {
        return character >= 'a' && character <= 'z';
    }

}
