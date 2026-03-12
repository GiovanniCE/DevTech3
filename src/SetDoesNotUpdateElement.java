/**
 * @author Giovanni Coronado-Esbona
 */
public class SetDoesNotUpdateElement<E> extends DoublyLinkedList<E> {
    @Override
    public E set(int index, E element) {
        return super.get(index);
    }
}