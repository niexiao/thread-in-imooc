package com.imooc.concurrent.base;

//�����߳�
//ģ����ս˫������Ϊ
public class ArmyRunnable implements Runnable {

	//volatile��֤���߳̿�����ȷ�Ķ�ȡ�����߳�д���ֵ
	//�ɼ��� ref JMM�� happens-beforeԭ��
	volatile boolean keepRunning = true;

	@Override
	public void run() {
		while(keepRunning){
			//����5����
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+"�����Է�["+i+"]");
				//�ó��˴�����ʱ�䣬�´θ�˭��������һ���أ�
				Thread.yield();
			}
			//˯�߰�˹�ٷ��ռ��ϴ��������䰮ʥ������	
			//sdfasdf 
		}
		
		System.out.println(Thread.currentThread().getName()+"������ս����");

	}

}
