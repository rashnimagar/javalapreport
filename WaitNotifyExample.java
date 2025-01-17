package Thread;

class Printer {
    public synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public synchronized void printLetters() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.print(c + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

class NumberThread extends Thread {
    private Printer printer;

    public NumberThread(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printNumbers();
    }
}

class LetterThread extends Thread {
    private Printer printer;

    public LetterThread(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printLetters();
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        Printer printer = new Printer();
        NumberThread numberThread = new NumberThread(printer);
        LetterThread letterThread = new LetterThread(printer);

        numberThread.start();
        letterThread.start();
    }
}
