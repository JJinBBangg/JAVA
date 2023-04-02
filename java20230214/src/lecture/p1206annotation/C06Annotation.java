package lecture.p1206annotation;

public class C06Annotation {
	public static void main(String[] args) {
		
	}
}

class MyClass06 {
	@MyAnnotation06
	String field1;
	@MyAnnotation06(myAttr = 10)
	int field2;
	@MyAnnotation06(myAttr = 20)
	boolean field3;
}

@interface MyAnnotation06 {
	int myAttr() default 0;
}