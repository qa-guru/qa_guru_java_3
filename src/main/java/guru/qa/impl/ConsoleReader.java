package guru.qa.impl;

import guru.qa.Operation;
import guru.qa.Operations;
import guru.qa.Reader;

import java.util.Scanner;

public class ConsoleReader implements Reader {

    private Scanner sc = new Scanner(System.in);

    @Override
    public int readFirst() {
        return sc.nextInt();
    }

    @Override
    public int readSecond() {
        return sc.nextInt();
    }

    @Override
    public Operation readOperation() {
        return Operations.lookup(sc.next().charAt(0)).getImplementation();
    }
}
