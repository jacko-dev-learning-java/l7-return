// Java program to call a non-static method 

class cool { 
	public String sum(String a, String b) { 
		return a + b; 
	} 
} 

class Main { 
  public static int integerss(int x, int y) {
    return x*y;
  }
	public static void main(String[] args) 
	{ 
		String n = "hello ", m = "world!"; 
		cool g = new cool(); 
		String s = g.sum(n,m);
		int b=4;
    int r=35;
    int bro = integerss(b,r);
		System.out.print(bro+s); 
	} 
} 
