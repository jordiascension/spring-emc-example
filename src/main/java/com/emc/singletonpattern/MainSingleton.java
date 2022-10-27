package com.emc.singletonpattern;

public class MainSingleton {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1.getUuid());
		System.out.println(s2.getUuid());

		if (s1.equals(s2)) {
			System.out.println("Las dos variables apuntan al mismo objeto");
		}
	}
}
