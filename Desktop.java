package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("Desktop Size");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop desk= new Desktop();
		desk.ComputerModel();
		desk.desktopSize();
	}

}
