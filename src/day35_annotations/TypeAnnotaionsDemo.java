package day35_annotations;

//Java Program to demonstrate Type annotaions 
//importing required classes 
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//Using target annotate]ion to annotate a Type
@Target(ElementType.TYPE_USE)
//Declaring simple type annotation
@interface TypeAnnoDemo {

}

public class TypeAnnotaionsDemo {

	public static void main(String[] args) {
		// Annotating the type of a String
		@TypeAnnoDemo
		String str = "Iam  annotated with a type annotation";
		System.out.println(str);
		abc();

	}

	static @TypeAnnoDemo int abc() {
		System.out.println("this functions return type is annotated");
		return 0;
	}

}
