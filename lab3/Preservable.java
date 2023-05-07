public interface Preservable {
    Memento save();
    void restore(Memento memento);
}