import java.util.LinkedList;
import java.util.List;

public class Caretaker {
    private final Preservable preservable;
    private final List<Memento> mementos = new LinkedList<>();

    public Caretaker(Preservable preservable) {
        this.preservable = preservable;
    }

    public void backup() {
        mementos.add(0, preservable.save());
    }

    public void undo() {
        if (mementos.size() > 0) {
            preservable.restore(mementos.remove(0));
        } else {
            System.out.println("No saved states to restore!");
        }
    }

    public void history() {
        mementos.forEach(it -> System.out.println(it.getName()));
    }
}