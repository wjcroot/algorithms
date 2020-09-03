package cn.algorithms.symbol;

/**
 * SymbolTable
 *
 * @author wang
 * @date 2020/9/3
 **/
public class SymbolTable<Key, Value>{
    private class Node {
        private Key key;
        private Value value;
        private Node next;

        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private int N;

    public SymbolTable() {
        this.head = new Node(null, null, null);
        this.N = 0;
    }

    public int size(){
        return N;
    }

    public void put(Key key,Value value){
        Node n=head;
        while (n.next != null){
            n=n.next;
            if (n.key.equals(key)){
                n.value=value;
                return;
            }
        }

        Node oldFirst=head.next;
        Node newNode=new Node(key,value,null);
        head.next=newNode;
        newNode.next=oldFirst;
        N++;
    }

    public  Value get(Key key){
        Node n=head;
        while (n.next != null){
            n=n.next;
            if (n.key.equals(key)){
                return n.value;
            }
        }
        return null;
    }

    public void delete(Key key){
        Node n=head;
        while (n.next != null){
            if (n.next.key.equals(key)){
                n.next=n.next.next;
            }
            n=n.next;
        }
        N--;
    }
}
