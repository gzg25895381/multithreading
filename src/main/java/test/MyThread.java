package test;
/** 
 * @author  作者 GuoZg E-mail: guozhenguo@huiyihuiying.com
 * @description 
 * @date 创建时间：2016年12月5日 下午2:14:15 
 * @version 1.0  
 */
public class MyThread extends Thread{

	private int count = 5;

	public MyThread(String name) {
		super();
		this.setName(name);
	}
	
	public void run(){
		super.run();
		while (count>0) {
			count --;
			System.out.println("由"+ Thread.currentThread().getName() + "计算，count=" + count);
		}
	}
}
