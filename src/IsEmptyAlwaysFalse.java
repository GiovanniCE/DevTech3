/**
 * @author Giovanni Coronado-Esbona
 */
public class IsEmptyAlwaysFalse<E> extends DoublyLinkedList<E> {
    @Override
    public boolean isEmpty() {
        return false;
    }
}