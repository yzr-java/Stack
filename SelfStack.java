package 栈的链表实现;

public class SelfStack<T> {
    //栈的属性：栈顶（底层是链表的头部）
    Node<T> top;

    public SelfStack(){}

    /**
     * 栈的三个常用方法：push、pop、peek
     * 分别代表：向栈顶添加元素、弹出栈顶元素、获取栈顶元素
     */

    public void push(T content) {
        if(this.top == null) {
            this.top = new Node(content, null);
        } else {
            this.top = new Node(content, this.top);
        }
        //或者直接写：this.top = new Node(content, this.top);
    }

    public T pop() {
        if(this.top == null){
            return null;
        } else {
            Node<T> node = this.top;
            this.top = this.top.next;
            node.next = null;
            return node.content;
        }
    }

    public T peek() {
        if(this.top == null) {
            return null;
        } else {
            return this.top.content;
        }
    }

    /**
     * 因为准备要做祖玛游戏的核心代码，所以抽象了一个Bead类代表珠子，
     * 以此来测试一下栈的构建是否完善。
     * (当然，在做核心代码时，应该不会用到栈数据结构，可能会选择链表或者数组)
     */
    public static void main(String args[]) {
        Bead zhuZi1 = new Bead("red");
        Bead zhuZi2 = new Bead("blue");
        SelfStack<Bead> stack = new SelfStack<>();
        stack.push(zhuZi1);
        System.out.println(stack.peek().color);
        stack.push(zhuZi2);
        System.out.println(stack.pop().color);
        System.out.println(stack.pop().color);
    }
    /**
     * 预期结果：
     * red
     * blue
     * red
     *
     * 实际结果与预期结果相符，栈构建正确
     */
}
