package hw1;
//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒

public class n3 {

	public static void main(String[]args) {
		int s =256559;
		int sec = s%60;
		int mins= (s/60)%60;
		int hr = (s/3600)%24;
		int day=(s/86400);
		
		System.out.println (day+"天"+hr+"時"+mins+"分"+sec+"秒");
	}
}
