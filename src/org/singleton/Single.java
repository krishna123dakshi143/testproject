package org.singleton;

public class Single {
	static Single object;
	private Single() {
		}
	public static Single getobject() {
		if(object==null) {
			System.out.println(System.identityHashCode(object));
			 object=new Single();
			System.out.println(System.identityHashCode(object));
		}
		return object;
		
	}
	public static void main(String[] args) {
		Single obj1 = getobject();
		System.out.println(System.identityHashCode(obj1));
		Single obj2 = getobject();
		System.out.println(System.identityHashCode(obj2));
		Single obj3 = getobject();
		System.out.println(System.identityHashCode(obj3));
	}

}
