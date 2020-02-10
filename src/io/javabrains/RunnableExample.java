package io.javabrains;

public class RunnableExample {

	public static void main(String[] args) {

		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside myThread runnable");
			}
		});

		myThread.run();

		// same code using lambda expression
		Thread lambdaThread = new Thread(() -> System.out.println("Inside lambdaThread runnable"));
		lambdaThread.run();
	}

}
