 public class Calculate {
	 public static void main(String[] arg) {
	 System.out.println("Calculate...");
	 int first= Integer.valueOf(arg[0]);
	 int second = Integer.valueOf(arg[1]);
	 double third = Double.valueOf(arg[2]);
	 double chetv = Double.valueOf(arg[3]);
	 int summ = first + second;
	 int proizv = first * second;
	 double summ1 = third + chetv;
	 double summ2;
	 summ2 = summ + summ1;
	 String stroka = arg[1] + " �����";
	 System.out.println("����� " + summ);
	 System.out.println("������������ " + proizv);
	 System.out.println("�����1 " + summ1);
	 System.out.println("�����2 " + summ2);
	 System.out.println(stroka);
	 }
 }