package com.info.abs_interface;
interface I1{
	void m1();
}
interface I12 extends I1{
	void m2();
}
public class InfcPolymorphism implements I1, I12{
@Override
public void m1() {
System.out.println("M1 is called");	
}

@Override
public void m2() {
System.out.println("M2 is called");	
}
public static void main(String[] args) {
	I1 ref1 = new InfcPolymorphism(); // Polymorphism Mechanism
	ref1.m1();
	I12 ref2 = new InfcPolymorphism();
	ref2.m2();
	ref2.m1();
	InfcPolymorphism ip = new InfcPolymorphism(); // Normal object creation
}
}
