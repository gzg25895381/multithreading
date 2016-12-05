package test;
/** 
 * @author  作者 GuoZg E-mail: guozhenguo@huiyihuiying.com
 * @description 
 * @date 创建时间：2016年12月5日 下午2:19:55 
 * @version 1.0  
 */
public class Run {
	public static void  main(String[] args){
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		a.start();
		b.start();
		c.start();
	}
}
