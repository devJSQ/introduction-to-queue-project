public class Main {
  /*add your code here*/
  public static void main(String[] args) {

      Queue que = new Queue();

      que.enqueue(100);
      que.enqueue(101);
      que.enqueue(102);

      que.dequeue();

      que.display();
    }
}
