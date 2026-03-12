/**
 * @author Giovanni Coronado-Esbona
 */
public class SizeReturnsNonZeroWhenEmpty<E> extends DoublyLinkedList<E> {
    @Override
    public int size() {
        if (super.size() == 0) {
            return 1;
        }
        return super.size();
    }
}