//数组模拟队列

import java.util.Scanner;

public class quene {
    public static void main(String[] args) {
        Arrayqueue queue = new Arrayqueue(3);
        char key;
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while(loop){
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("g(get): 添加数据到队列");
            System.out.println("h(head): 查看队列头数据");
            System.out.println("a(add): 添加一个数据");
            key = scanner.next().charAt(0);//   接收一个字符
            switch (key){
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("输入一个数");
                    int value = scanner.nextInt();
                    queue.adddata(value);
                    break;
                case 'g'://取出数据
                    try {
                        int res = queue.getQueue();
                        System.out.printf("取出的数据是%d\n",res);
                    }
                    catch (Exception e){
                        //TODO: handle exception
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h'://查看队列头的数据
                    try {
                        int res = queue.headQueue();
                        System.out.printf("取出的数据是%d\n",res);
                    }
                    catch (Exception e){
                        //TODO: handle exception
                        System.out.println(e.getMessage());
                    }

                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
            }
        System.out.println("程序退出");
        }


    }
}
class Arrayqueue{
     private int maxSize;//最大容量
     private int front;//队列头
     private int rear;//队列尾
     private int[] arr;//存放数据，模拟队列

     public Arrayqueue(int arrmaxSize){
         maxSize = arrmaxSize;
         arr = new int[maxSize];
         front = -1;
         rear = -1;
     }
     //判断队列是否为满
    public boolean isFull(){
         return rear == maxSize - 1;
    }
    //判断队列是否为空
    public  boolean isEmpty(){
         return  rear == front;
    }
    //添加数据到队列（如果是数组）
    public void  adddata(int n){
         if(isFull()){
             System.out.println("数组满了，无法添加");
         }
         rear++;
         arr[rear] = n;
    }
    //获取队列数据，输出队列
    public int getQueue(){
         if(isEmpty()){
             throw new RuntimeException("队列空，不能输出数据");
         }
         front ++;
         return  arr[front];
    }
    //显示队列所有数据
    public void showQueue(){
         if (isEmpty()){
             System.out.println("空的");
             return;
         }
        for (int i =0; i < arr.length; i++){
            System.out.printf("arr[%d]=%d/n" , i , arr[i]);
        }
    }
    //显示队列的头数据
    public int headQueue(){
         if(isEmpty()){
             throw new RuntimeException("没数据，显示不了了");
         }
        return arr[front + 1];
    }
}