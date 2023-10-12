package Task1;

public class Flow {

    public void methodA(String input) {
        System.out.print("J");

        if (input.equals("start")) {
            System.out.print(input.charAt(2));
            System.out.print("v");
            methodB();
            System.out.print(methodD("start"));
        } else {
            System.out.print("e");
            System.out.print(methodD(input));
            methodB();
        }

        System.out.print("t");
    }

    public void methodB() {
        System.out.print("a");
    }

    public void methodC(int len) {
        System.out.print("j");

        if (len > 4) {
            System.out.print("o");
        } else {
            System.out.print("f");
        }
    }

    public char methodD(String input) {
        System.out.print(" ");

        try {
            System.out.print("e");
            System.out.print(methodE(input.charAt(3)));
            methodC(input.length());
            return 'v';
        } catch (Exception e) {
            System.out.print('g');
            return 'k';
        }
    }

    public char methodE(char c) {
        System.out.print(c);

        if (Character.isLetter(c)) {
            System.out.print(" ");
            return 's';
        } else {
            return 'k';
        }
    }
}
