package labprgms;

public class ArchitectureofJVM {
	public static void main(String[] args) {
		// About Architecture of JVM
		System.out.println("JVM is Java virtual machine.");
		System.out.println("JVM is platform dependent.");
		System.out.println("A Java Virtual Machine (JVM) is the software-based engine necessary for running Java bytecode applications");
		System.out.println("It is responsible for performing bytecode analysis, understanding the code and then running it");
		System.out.println("A JVM is responsible for loading a file that has been written and compiled into a .class file.");
		System.out.println("Execution of class files performed in a stepwise manner by the different components of a Java Virtual Machine");
		System.out.println("A Java Virtual Machine (JVM) has three main subsections");
		System.out.println("The main three sections are ClassloaderSubSystem,Runtime Data Areas,Execution Engine");
		System.out.println("A classloader subsystem is responsible for performing the dynamic class loading functions of Java");
		System.out.println("It is responsible for loading, linking and initialising compiled .class files.");
		System.out.println("BootStrap ClassLoader Typically loads rt.jar classes and other core libraries from the bootstrap classpath loader is prioritised over others");
		System.out.println("The linking section of the ClassLoader Subsystem performs three integral steps ");
		System.out.println("Initialisation This section of a ClassLoader designates original values to all static variables. Java static block code executed in the initialisation phase.");
		System.out.println("Method Area  It is a shared resource of the JVM that stores class-level data");
		System.out.println("Heap Area It stores all objects, along with their respective arrays and variables.");
		System.out.println("Stack Area Separate runtime stacks are created for individual threads.");
				

	}

}