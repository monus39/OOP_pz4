package src.main.oop.homeworkPz4;


public class MyList<T> implements MyLinkedList<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size = 0;

    public MyList(){
        lastNode = new Node<T>(null, firstNode, null);
        firstNode = new Node<T>(null, null, lastNode);
    }


    private static class Node<T>{
        private T currentElement;
        private Node<T> nextElement;
        private Node<T> prevElement;

       private Node(T currentElement,Node<T> prevElement ,Node<T> nextElement){
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
       }

       public T getCurrentElement(){return currentElement;}
        public void setCurrentElement(T currentElement){ this.currentElement = currentElement; }
        public Node<T> getNextElement(){return nextElement;}
        public void setNextElement(Node<T> nextElement){this.nextElement = nextElement; }
        public Node<T> getPrevElement(){return prevElement;}
        public void setPrevElement(Node<T> prevElement){ this.prevElement = prevElement;}

    }

    @Override
    public void addLast(T t) {
        Node<T> prev = lastNode;
        prev.setCurrentElement(t);
        lastNode = new Node<T>(null, prev, null);
        prev.setNextElement(lastNode);
        size++;
    }

    @Override
    public void addFirst(T t) {
        Node<T> next = firstNode;
        next.setCurrentElement(t);
        firstNode = new Node<>(null, null, next);
        next.setPrevElement(firstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getElementByIndex(int counter) {
        Node<T> target = firstNode.getNextElement();
        for (int i = 0; i < counter; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }
    private Node<T> getNextElement(Node<T> current){
        return current.getNextElement();
    }


}