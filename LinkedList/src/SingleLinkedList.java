public class SingleLinkedList <E> {

    private Node<E> head;

    public void add(E data){

        Node<E> newNode = new SingleNode<E>(data);

        if(head == null){

            head = newNode;

        }
        else{

            Node<E> current = head;

            while(current.getNext() != null){

                current = current.getNext();

            }

            current.setNext(newNode);

        }

    }

    public E display(){

        Node<E> current = head;

        while(current.getNext() != null){

            current = current.getNext();

        }

        return current.getData();

    }

    public E search(E data){

        Node<E> current = head;

        while(current.getNext() != null){

            if(current.getData() == data){

                return current.getData();

            }

            current = current.getNext();

        }

        return null;

    }

    public void remove(){

        Node<E> current = head;

        while(current.getNext().getNext() != null){

            current = current.getNext();

        }

        current.setNext(null);

    }

    public void remove(E data){

        Node<E> current = head;

        while(current.getNext() != null){

            if(current.getNext().getData() == data && current.getNext().getNext().getData() != null){

                current.setNext(current.getNext().getNext());

            }

            if(current.getNext().getData() == data && current.getNext().getNext().getData() == null){

                remove();

            }

        }


    }

}
