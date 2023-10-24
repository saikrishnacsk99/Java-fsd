package AssistedPractice;

public class JavaInnerclass {
	public static void main(String[] args) { class OuterClass { int x = 10;

	class InnerClass{

	int y = 5;

	}

	}

	OuterClass myOuter = new OuterClass();

	OuterClass.InnerClass mylnner = myOuter.new InnerClass(); System.out.println(mylnner.y + myOuter.x);

	}
}
