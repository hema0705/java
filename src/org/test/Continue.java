package org.test;

public class Continue {
	private void cost() {
System.out.println("1000");
	}	
	public static void main(String[] args) {
		Continue x = new Continue();
		x.cost();	
    for (int i = 1; i <= 10; i++) {
        if (i == 5) {
          continue;
        }
        System.out.println(i);

      }

    }

  }
	


