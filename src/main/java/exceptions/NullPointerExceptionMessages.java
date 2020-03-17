package exceptions;


//-XX:+ShowCodeDetailsInExceptionMessages
public class NullPointerExceptionMessages {
	private Student person;

	public Student getStudent() {
		return person;
	}

	public static void main(String[] args) {
		NullPointerExceptionMessages obj = new NullPointerExceptionMessages();
		System.out.println(obj.getStudent().name());
		/**
		 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "exceptions.Student.name()" because the return value of "exceptions.NullPointerExceptionMessages.getStudent()" is null
		 * 	at exceptions.NullPointerExceptionMessages.main(NullPointerExceptionMessages.java:14)
		 */
	}
}

record Student(String name) {
}
