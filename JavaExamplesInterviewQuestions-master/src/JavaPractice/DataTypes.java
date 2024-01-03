package JavaPractice;

public class DataTypes {

	public static void main(String[] args) {
		
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 922337203;
		float f = 3.4028235E38f;
		double d = 1.7976931348623157E308;
		boolean b1 = true;
		boolean b2 = false;
		char c = 'w';
		
		System.out.println("Byte Size --> " + Byte.SIZE/8);
		System.out.println("Short Size --> " + Short.SIZE/8);
		System.out.println("Integer Size --> " + Integer.SIZE/8);
		System.out.println("Long Size --> " + Long.SIZE/8);
		System.out.println("Float Size --> " + Float.SIZE/8);
		System.out.println("Double Size --> " + Double.SIZE/8);
		
		
		
		System.out.println("Byte Min Value --> " + Byte.MIN_VALUE);
		System.out.println("Byte Max Value --> " + Byte.MAX_VALUE);
		System.out.println("Short Min Value --> " + Short.MIN_VALUE);
		System.out.println("Short Max Value --> " + Short.MAX_VALUE);
		System.out.println("Integer Min Value --> " + Integer.MIN_VALUE);
		System.out.println("Integer Max Value --> " + Integer.MAX_VALUE);
		System.out.println("Long Min Value --> " + Long.MIN_VALUE);
		System.out.println("Long Max Value --> " + Long.MAX_VALUE);
		System.out.println("Float Min Value --> " + Float.MIN_VALUE);
		System.out.println("Float Max Value --> " + Float.MAX_VALUE);
		System.out.println("Double Min Value --> " + Double.MIN_VALUE);
		System.out.println("Double Max Value --> " + Double.MAX_VALUE);
		
		

	}

}
