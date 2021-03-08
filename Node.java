package 栈的链表实现;

public class Node<T> {
    //采用泛型设计
    T content;
    Node<T> next;

    public Node(){}

    public Node(T content, Node<T> next){
        this.content = content;
        this.next = next;
    }
}
