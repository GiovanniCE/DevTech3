/**
 * @author Giovanni Coronado-Esbona
 */
public class SetAtOutOfBoundsDoesNotThrow<E> extends DoublyLinkedList<E> {
    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size()) {
            return null; 
        }
        return super.set(index, element);
    }
}