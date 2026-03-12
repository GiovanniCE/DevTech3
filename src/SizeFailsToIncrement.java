/**
 * @author Giovanni Coronado-Esbona
 */
public class SizeFailsToIncrement<E> extends DoublyLinkedList<E> {
    @Override
    public int size() {
        if (super.size() > 0) {
            return 0;
        }
        return super.size();
    }
}