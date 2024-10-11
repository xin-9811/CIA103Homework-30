package Hw8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.math.BigInteger;

// 		請建立一個Collection物件並將以下資料加入:
// 		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、 Object物件、“Snoopy”、BigInteger(“1000”)

public class Hw8_01 {
	public static void main(String[] agrs) {

		Collection c1 = new ArrayList();
		c1.add(new Integer(100));
		c1.add(new Integer(100));
		c1.add(new Double(3.14));
		c1.add(new Long(21L));
		c1.add(new Short("100"));
		c1.add(new Double(5.1));
		c1.add(new Long(21L));
		c1.add("Kitty");
		c1.add(new Object());
		c1.add("Snoopy");
		c1.add(new BigInteger("100"));

//		 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)		
		Iterator itr = c1.iterator();

		System.out.println("for-loop：");
		for (int i = 0; i < c1.size(); i++) {
			Object obj = ((ArrayList) c1).get(i);
			System.out.print(obj + "\t");
		}
		
		System.out.println(" ");
		System.out.println("for-each："+ "\t");
		for (; itr.hasNext(); ) {
            System.out.print(itr.next()+ "\t");
        }
		
//		• 移除不是java.lang.Number相關的物件
		
		   Iterator<Object> itr2 = c1.iterator();
	        while (itr2.hasNext()) {
	            Object obj = itr2.next();
	            if (!(obj instanceof Number)) {
	                itr2.remove();
	            }
	        }    
        System.out.println();
        System.out.println("Deleted Non-Number Object");
    
//		• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
        
        
	}
}
