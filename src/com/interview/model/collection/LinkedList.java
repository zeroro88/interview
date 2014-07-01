package com.interview.model.collection;

/**
 * Created_By: stefanie
 * Date: 14-7-1
 * Time: 下午10:14
 */
public class LinkedList<T> implements List<T> {
    class Node<T>{
        T item;
        Node next;
        public Node(T element){
           item = element;
        }
    }

    Node head;
    int size;

    @Override
    public void add(T element) {
        add(size, element);
    }

    @Override
    public void add(int index, T element) {
        Node node = new Node(element);
        if(index >= 0 && index <= size){
            if(index == 0){
                node.next = head;
                head = node;
            } else {
                Node<T> current = head;
                for(int i = 0; i < index - 1; i++) current = current.next;
                node.next = current.next;
                current.next = node;
            }
            size++;
        }
    }

    @Override
    public T get(int index) {
        Node<T> node = getNode(index);
        if(node != null) return node.item;
        else return null;
    }

    @Override
    public int indexOf(T element) {
        int index = 0;
        Node<T> current = head;
        while(current != null && !current.item.equals(element)){
            index++;
            current = current.next;
        }
        if(current == null) return -1;
        else return index;
    }

    @Override
    public boolean contains(T element) {
        int index = indexOf(element);
        return index >= 0;
    }

    @Override
    public T remove(int index) {
        if(index >= 0 && index < size){
            int i = 0;
            Node<T> current = head;
            Node<T> previous = null;
            while(i < index){
                previous = current;
                current = current.next;
                i++;
            }
            if(previous != null) previous.next = current.next;
            else head = current.next;
            size--;
            return current.item;
        } else {
            return null;
        }
    }

    @Override
    public T remove(T element) {
        int index = indexOf(element);
        return remove(index);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size <= 0;
    }

    protected Node<T> getNode(int index){
        if(index >= 0 && index < size){
            int i = 0;
            Node<T> current = head;
            while(i < index){
                current = current.next;
                i++;
            }
            return current;
        } else {
            return null;
        }
    }
}
