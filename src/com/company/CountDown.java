package com.company;


class CountDown {
private int i; //when its instance variable thats will make the vaibale shared between thread1 and 2 in heap , => thread interference
    // every thrrad has his thread stack , so if variable is local so thats mean thrread can read local variable from thread stack not heap wich is shared

    public void doCountDown() {

        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;

        }

        for (i = 10; i > 0; i--) { // if "for int i =10" not for i=10 thats mean thread will run only his own way can t read the local varibale stored in thread stack of thread 2
            System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
        }

    }

}
